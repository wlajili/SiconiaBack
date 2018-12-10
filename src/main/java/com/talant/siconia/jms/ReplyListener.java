package com.talant.siconia.jms;

import java.io.StringReader;
import java.util.Optional;

import javax.jms.Message;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.talan.siconia.connectmeter.reply.MeterAssetConnectArmedReplyMessage;
import com.talan.siconia.connectmeter.reply.ObjectFactory;
import com.talan.siconia.helper.ConvertDateHelper;
import com.talant.siconia.dao.EchangeRepository;
import com.talant.siconia.entite.EchangeEntity;

@Component
public class ReplyListener {
	
	@Autowired
	EchangeRepository echangeRepository;

	@JmsListener(destination = "Reply.queue")
	public void receive(Message message) {
		
		EchangeEntity echange = new EchangeEntity();
		if (message instanceof TextMessage) {
			try {
				String contenu = ((TextMessage) message).getText();
				
				JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				XMLStreamReader xmlReader = readXMLFromString(contenu);
				MeterAssetConnectArmedReplyMessage meterAssetConnectArmedReplyMessage =  (MeterAssetConnectArmedReplyMessage)jaxbUnmarshaller.unmarshal(xmlReader);
				
				Long id = Long.valueOf(meterAssetConnectArmedReplyMessage.getReply().getCorrelationId());
				
				Optional<EchangeEntity> optional= echangeRepository.findById(id);
				if (optional.isPresent()) {
					echange = optional.get();
					echange.setVerb(meterAssetConnectArmedReplyMessage.getHeader().getVerb());
					echange.setNoun(meterAssetConnectArmedReplyMessage.getHeader().getNoun());
					echange.setRevision(meterAssetConnectArmedReplyMessage.getHeader().getRevision());
					echange.setDateTime(ConvertDateHelper.getDateFromXMLGregorianCalendar(meterAssetConnectArmedReplyMessage.getHeader().getDateTime()));
					echange.setSource(meterAssetConnectArmedReplyMessage.getHeader().getSource());
					echange.setReplyCode(meterAssetConnectArmedReplyMessage.getReply().getReplyCode());
				}
				
				echange = echangeRepository.save(echange);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public XMLStreamReader readXMLFromString(final String xmlContent) throws XMLStreamException
	{
	    final XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	    final StringReader reader = new StringReader(xmlContent);
	    return inputFactory.createXMLStreamReader(reader);
	}
}
