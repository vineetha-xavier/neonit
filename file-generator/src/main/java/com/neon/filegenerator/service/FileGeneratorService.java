package com.neon.filegenerator.service;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class FileGeneratorService {
	private static final String XML_TEMPLATE = "/templates/pacs008-gen.xml";
	private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
	public String generateNewXMLString(String frFIIdFinInstnId, String toFIIdFinInstnId, String instgAgt, String instdAgt, 
			Double intrBkSttlmAmt, String dbtrAcctId, String dbtrAcctIssr, String dbtrAgtFinInstnId, String cdtrAgtFinInstnId, 
			String cdtrAcctId, String cdtrAcctIssr) throws Exception {
		
		String templeteXml = MessageUtils.getXmlString(XML_TEMPLATE);
		MessageFormat messageformat = new MessageFormat(templeteXml);
		String creDate = DATE_FORMAT.format(new Date());
		String pmtIdEndToEndId = UUID.randomUUID().toString();
		String pmtIdTxId = UUID.randomUUID().toString();
		Object[] objs = {frFIIdFinInstnId,toFIIdFinInstnId,creDate,instgAgt,instdAgt,pmtIdEndToEndId,pmtIdTxId,intrBkSttlmAmt,dbtrAcctId,
				dbtrAcctIssr,dbtrAgtFinInstnId,cdtrAgtFinInstnId,cdtrAcctId,cdtrAcctIssr};
		
		String generatedXml = messageformat.format(objs);
		
		String fileName = MessageUtils.stringToXML(generatedXml,pmtIdEndToEndId);
		return fileName;
		
	}
	
	
	

}
