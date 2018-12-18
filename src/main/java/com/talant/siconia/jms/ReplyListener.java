package com.talant.siconia.jms;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.jms.utility.JaxbTransformMessage;
import com.talant.siconia.service.EchangeService;

@Component
public class ReplyListener {
	
	@Autowired
	EchangeService echangeService;

	@JmsListener(destination = "Reply.queue")
	public void receive(Message message) {
		
		EchangeDTO echangeDTO = new EchangeDTO();
		
		if (message instanceof TextMessage) {
			try {
				String contenu = ((TextMessage) message).getText();
				echangeDTO = JaxbTransformMessage.connectionReplyMessage(contenu, echangeService);
				echangeDTO = echangeService.addEchange(echangeDTO);
			}catch (Exception e) {
				System.out.println(e.getCause());
			}
		}
	}
	
}
