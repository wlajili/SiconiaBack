package com.talant.siconia.service.impl;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.dao.DeviceRepository;
import com.talant.siconia.dao.EchangeRepository;
import com.talant.siconia.jms.utility.JaxbTransformMessage;
import com.talant.siconia.service.EchangeService;

@Service
public class EchangeServiceImpl implements EchangeService{

	@Autowired
	@Lazy
	@Qualifier("echangeRepository")
	EchangeRepository echangeRepository;
	
	@Autowired
	@Lazy
	@Qualifier("deviceRepository")
	DeviceRepository deviceRepository;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Override
	public EchangeDTO addEchange(EchangeDTO echangeDTO) {
	
		EchangeDTO resalt = echangeRepository.saveEchange(echangeDTO);
		DeviceDTO deviceDTO = deviceRepository.findDeviceById(resalt.getDeviceId());
		String message = "";
		try {
			message = JaxbTransformMessage.connectionRequestMessage(resalt, deviceDTO);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jmsTemplate.convertAndSend("Rquest.queue", message);
		
		return resalt;
		
	}

	@Override
	public EchangeDTO findEchangeById(Long id) {
		
		return echangeRepository.findEchangeById(id);
	}

}
