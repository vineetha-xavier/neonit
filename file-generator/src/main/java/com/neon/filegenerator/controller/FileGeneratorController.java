package com.neon.filegenerator.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neon.filegenerator.service.FileGeneratorService;
@RestController
public class FileGeneratorController {

	@Autowired
	FileGeneratorService service;
	
	@Produces(MediaType.APPLICATION_XML)
	@RequestMapping(value="/filedownload", method = RequestMethod.POST)	
	public void getFile(HttpServletResponse response,ModelMap model, @RequestParam String frFIIdFinInstnId, @RequestParam String toFIIdFinInstnId, @RequestParam String instgAgt, @RequestParam String instdAgt, 
			@RequestParam Double intrBkSttlmAmt, @RequestParam String dbtrAcctId, @RequestParam String dbtrAcctIssr, @RequestParam String dbtrAgtFinInstnId, @RequestParam String cdtrAgtFinInstnId, 
			@RequestParam String cdtrAcctId, @RequestParam String cdtrAcctIssr) throws Exception{
		
		String fileName = service.generateNewXMLString(frFIIdFinInstnId, toFIIdFinInstnId, instgAgt, instdAgt, intrBkSttlmAmt, dbtrAcctId, dbtrAcctIssr, dbtrAgtFinInstnId, cdtrAgtFinInstnId, cdtrAcctId, cdtrAcctIssr);
		System.out.println(fileName);
		
		Path file = Paths.get(fileName);
		response.setContentType("application/xml");
        response.addHeader("Content-Disposition", "attachment; filename="+fileName );
        try
        {
            Files.copy(file, response.getOutputStream());
            response.getOutputStream().flush();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
		
	}
}
