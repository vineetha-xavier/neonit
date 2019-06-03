package com.neon.filegenerator.controller;

import java.io.File;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.neon.filegenerator.service.FileGeneratorService;


@Controller
@SessionAttributes("name")
public class FileController {
	
	@Autowired
	FileGeneratorService service;
	
	@RequestMapping(value="/filedownload", method = RequestMethod.GET)
	public String showFileDownload(ModelMap model){
		return "fileui";
	}
	
	
	
	

}
