package com.talant.siconia.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talant.siconia.DTO.EchangeDTO;

@Service
@Transactional
public interface EchangeService {
	
	public EchangeDTO addEchange(EchangeDTO echangeDTO);
	public EchangeDTO findEchangeById(Long id);

}
