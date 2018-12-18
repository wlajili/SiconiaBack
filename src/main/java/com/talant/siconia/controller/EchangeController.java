package com.talant.siconia.controller;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.service.EchangeService;

/***
 * 
 * File EchangeController.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of EchangeController.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EchangeController {

	@Autowired
	@Lazy
	EchangeService echangeService;
	
	@PostMapping("/request")
	public EchangeDTO save(@RequestBody EchangeDTO request) throws JAXBException, XMLStreamException {
		
		EchangeDTO echangeDTO = echangeService.addEchange(request);
		
		return echangeDTO;
	}
	
}
