package com.neon.filegenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.neon.filegenerator.service.FileGeneratorService;


@Controller
@SessionAttributes("name")
public class FileWebController {
	
	@Autowired
	FileGeneratorService service;
	
	@RequestMapping(value="/filedownload", method = RequestMethod.GET)
	public String showFileDownload(ModelMap model){
		return "fileui";
	}
	
	
	
	

}
