package com.talant.siconia.controler;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage.Header;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage.Payload;
import com.talan.siconia.connectmeter.request.MeterAssetConnectArmedRequestMessage.Payload.MeterAsset;
import com.talan.siconia.connectmeter.request.ObjectFactory;
import com.talan.siconia.helper.ConvertDateHelper;
import com.talant.siconia.dao.EchangeRepository;
import com.talant.siconia.entite.EchangeEntity;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EchangeControler {

	@Autowired
	EchangeRepository echangeRepository;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@PostMapping("/request")
	public EchangeEntity save(@RequestBody EchangeEntity request) throws JAXBException, XMLStreamException {
		EchangeEntity requestEntity = echangeRepository.save(request);
		
		MeterAssetConnectArmedRequestMessage meterAssetConnectArmedRequestMessage =  new MeterAssetConnectArmedRequestMessage();
		meterAssetConnectArmedRequestMessage.setHeader(new Header());
		meterAssetConnectArmedRequestMessage.getHeader().setVerb(requestEntity.getVerb());
		meterAssetConnectArmedRequestMessage.getHeader().setNoun(requestEntity.getNoun());
		meterAssetConnectArmedRequestMessage.getHeader().setRevision(requestEntity.getRevision());
		meterAssetConnectArmedRequestMessage.getHeader().setDateTime(ConvertDateHelper.getXMLGregorianCalendarFromDate(requestEntity.getDateTime()));
		meterAssetConnectArmedRequestMessage.getHeader().setSource(requestEntity.getSource());
		meterAssetConnectArmedRequestMessage.getHeader().setMessageID(requestEntity.getMessageID().intValue());
		meterAssetConnectArmedRequestMessage.setPayload(new Payload());
		meterAssetConnectArmedRequestMessage.getPayload().setRequestPriority(requestEntity.getRequestPriority());
		meterAssetConnectArmedRequestMessage.getPayload().setExecuteStartTime(ConvertDateHelper.getXMLGregorianCalendarFromDate(requestEntity.getExecuteStartTime()));
		meterAssetConnectArmedRequestMessage.getPayload().setExecuteExpireTime(ConvertDateHelper.getXMLGregorianCalendarFromDate(requestEntity.getExecuteExpireTime()));
		meterAssetConnectArmedRequestMessage.getPayload().setMeterAsset(new MeterAsset());
		//
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setMRID(requestEntity.getDevice().getMrid());
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setIdType(requestEntity.getDevice().getIdType());;
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setPathName(requestEntity.getDevice().getPathName());;
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setModelNumber(requestEntity.getDevice().getModelNumber());;
		meterAssetConnectArmedRequestMessage.getPayload().getMeterAsset().setSerialNumber(requestEntity.getDevice().getSerialNumber());;
		
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(meterAssetConnectArmedRequestMessage, sw);
		
		jmsTemplate.convertAndSend("Rquest.queue", sw.toString());
		
		return requestEntity;
	}
	
}
