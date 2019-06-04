package com.neon.filegenerator.controller;

import java.io.File;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neon.filegenerator.service.FileGeneratorService;
@RestController
public class FileRestController {

	@Autowired
	FileGeneratorService service;
	
	@Produces(MediaType.APPLICATION_XML)
	@RequestMapping(value="/filedownload", method = RequestMethod.POST)	
	public Response getFile(ModelMap model, @RequestParam String frFIIdFinInstnId, @RequestParam String toFIIdFinInstnId, @RequestParam String instgAgt, @RequestParam String instdAgt, 
			@RequestParam Double intrBkSttlmAmt, @RequestParam String dbtrAcctId, @RequestParam String dbtrAcctIssr, @RequestParam String dbtrAgtFinInstnId, @RequestParam String cdtrAgtFinInstnId, 
			@RequestParam String cdtrAcctId, @RequestParam String cdtrAcctIssr) throws Exception{
		
		String newXMLString = service.generateNewXMLString(frFIIdFinInstnId, toFIIdFinInstnId, instgAgt, instdAgt, intrBkSttlmAmt, dbtrAcctId, dbtrAcctIssr, dbtrAgtFinInstnId, cdtrAgtFinInstnId, cdtrAcctId, cdtrAcctIssr);
		System.out.println(newXMLString);
		File file = service.generateXML(newXMLString);
		ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition", "attachment; filename=" + file.getName());
        
		return response.build();
	}
}
