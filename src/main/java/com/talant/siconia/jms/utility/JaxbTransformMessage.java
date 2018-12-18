package com.talant.siconia.jms.utility;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import com.talan.siconia.connectmeter.reply.MeterAssetConnectArmedReplyMessage;
import com.talan.siconia.connectmeter.reply.ObjectFactoryConnectArmedReplyMessage;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage.Header;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage.Payload;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage.Payload.MeterAsset;
import com.talan.siconia.connectmeter.request.ObjectFactoryConnectArmedRequestMessage;
import com.talan.siconia.helper.ConvertDateHelper;
import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.service.EchangeService;

public class JaxbTransformMessage {

	public static String connectionRequestMessage(EchangeDTO echangeDTO, DeviceDTO deviceDTO) throws JAXBException {
		
		MeterAssetConnectArmedRequestMessage meterAssetConnectArmedRequestMessage =  new MeterAssetConnectArmedRequestMessage();
		meterAssetConnectArmedRequestMessage.setHeader(new Header());
		meterAssetConnectArmedRequestMessage.getHeader().setVerb(echangeDTO.getVerb());
		meterAssetConnectArmedRequestMessage.getHeader().setNoun(echangeDTO.getNoun());
		meterAssetConnectArmedRequestMessage.getHeader().setRevision(echangeDTO.getRevision());
		meterAssetConnectArmedRequestMessage.getHeader().setDateTime(ConvertDateHelper.getXMLGregorianCalendarFromDate(echangeDTO.getDateTime()));
		meterAssetConnectArmedRequestMessage.getHeader().setSource(echangeDTO.getSource());
		meterAssetConnectArmedRequestMessage.getHeader().setMessageID(echangeDTO.getMessageID().intValue());
		meterAssetConnectArmedRequestMessage.setPayload(new Payload());
		meterAssetConnectArmedRequestMessage.getPayload().setRequestPriority(echangeDTO.getRequestPriority());
		meterAssetConnectArmedRequestMessage.getPayload().setExecuteStartTime(ConvertDateHelper.getXMLGregorianCalendarFromDate(echangeDTO.getExecuteStartTime()));
		meterAssetConnectArmedRequestMessage.getPayload().setExecuteExpireTime(ConvertDateHelper.getXMLGregorianCalendarFromDate(echangeDTO.getExecuteExpireTime()));
		meterAssetConnectArmedRequestMessage.getPayload().setMeterAsset(new MeterAsset());
		//
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setMRID(deviceDTO.getMrid());
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setIdType(deviceDTO.getIdType());;
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setPathName(deviceDTO.getPathName());;
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setModelNumber(deviceDTO.getModelNumber());;
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setSerialNumber(deviceDTO.getSerialNumber());;
		
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactoryConnectArmedRequestMessage.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(meterAssetConnectArmedRequestMessage, sw);
		
		return sw.toString();
	}
	
	public static EchangeDTO connectionReplyMessage(String message, EchangeService echangeService) throws JAXBException, XMLStreamException {
		
		EchangeDTO echangeDTO = new EchangeDTO();
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactoryConnectArmedReplyMessage.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		XMLStreamReader xmlReader = readXMLFromString(message);
		MeterAssetConnectArmedReplyMessage meterAssetConnectArmedReplyMessage =  (MeterAssetConnectArmedReplyMessage)jaxbUnmarshaller.unmarshal(xmlReader);
		
		Long id = Long.valueOf(meterAssetConnectArmedReplyMessage.getReply().getCorrelationId());
		
		echangeDTO= echangeService.findEchangeById(id);
		if(echangeDTO.getMessageID() != null) {
			echangeDTO.setVerb(meterAssetConnectArmedReplyMessage.getHeader().getVerb());
			echangeDTO.setNoun(meterAssetConnectArmedReplyMessage.getHeader().getNoun());
			echangeDTO.setRevision(meterAssetConnectArmedReplyMessage.getHeader().getRevision());
			echangeDTO.setDateTime(ConvertDateHelper.getDateFromXMLGregorianCalendar(meterAssetConnectArmedReplyMessage.getHeader().getDateTime()));
			echangeDTO.setSource(meterAssetConnectArmedReplyMessage.getHeader().getSource());
			echangeDTO.setReplyCode(meterAssetConnectArmedReplyMessage.getReply().getReplyCode());
		}
		return echangeDTO;
		
	}
	
	public static XMLStreamReader readXMLFromString(final String xmlContent) throws XMLStreamException	{
	    
		final XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	    final StringReader reader = new StringReader(xmlContent);
	    return inputFactory.createXMLStreamReader(reader);
	    
	}
}
