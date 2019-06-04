package com.neon.filegenerator.service;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

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

	public static String stringToXML(String xmlString, String pmtIdEndToEndId) throws Exception {

		/*DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;
		builder = factory.newDocumentBuilder();

		// Use String reader
		Document document = builder.parse(new InputSource(new StringReader(xmlString)));	*/
		
		 java.io.FileWriter fw = new java.io.FileWriter("output-files/"+pmtIdEndToEndId+".xml");
		    fw.write(xmlString);
		    fw.close();
		 
		 return "output-files/"+pmtIdEndToEndId+".xml";
		
	}

}
