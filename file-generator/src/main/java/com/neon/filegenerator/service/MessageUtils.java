package com.neon.filegenerator.service;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class MessageUtils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(MessageUtils.class);

	public static String getXmlString(String queryPath) {
		String data = null;
		ClassPathResource cpr = new ClassPathResource(queryPath);
		try {
			byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
			data = new String(bdata, StandardCharsets.UTF_8);
		} catch (IOException e) {
			LOGGER.error("Error Ocuured in getXmlString method :{}", e.getMessage());
		}
		return data;
	}

	public static File stringToXML(String xmlString) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;
		builder = factory.newDocumentBuilder();

		// Use String reader
		Document document = builder.parse(new InputSource(new StringReader(xmlString)));	
		File file = new File("pacsxml.xml");
		 TransformerFactory tranFactory = TransformerFactory.newInstance();
		 Transformer aTransformer = tranFactory.newTransformer();
		 Source src = new DOMSource( document );
		 Result dest = new StreamResult( file );
		 aTransformer.transform( src, dest );
		 

		return file;
	}

}
