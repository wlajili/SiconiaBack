package com.talant.siconia.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.dao.DeviceRepository;
import com.talant.siconia.dao.EchangeDAOCustum;
import com.talant.siconia.dao.EchangeRepository;
import com.talant.siconia.entite.DeviceEntity;
import com.talant.siconia.entite.EchangeEntity;
import com.talant.siconia.mapper.EchangeUtility;

public class EchangeRepositoryImpl implements EchangeDAOCustum{
	
	@Autowired
	@Lazy
	@Qualifier("echangeRepository")
	EchangeRepository echangeRepository;
	
	@Autowired
	@Lazy
	@Qualifier("deviceRepository")
	DeviceRepository deviceRepository;

	@Override
	public EchangeEntity entityFromDTO(EchangeDTO echangeDTO) {
		DeviceEntity deviceEntity = null != echangeDTO.getDeviceId() ? deviceRepository.findById(echangeDTO.getDeviceId()).orElse(new DeviceEntity()): null;
		return EchangeUtility.convertEchangeDTOtoEchangeEntity(echangeDTO, deviceEntity);
	}

	@Override
	public EchangeDTO dtoFromEntity(EchangeEntity echangeEntity) {
		return EchangeUtility.convertEchangeEntityToEchangeDTO(echangeEntity);
	}

	@Override
	public EchangeDTO saveEchange(EchangeDTO echangeDTO) {
		EchangeEntity echangeEntity = entityFromDTO(echangeDTO);
		return dtoFromEntity(echangeRepository.save(echangeEntity));
	}

	@Override
	public EchangeDTO findEchangeById(Long id) {
		return dtoFromEntity(echangeRepository.findById(id).orElse(new EchangeEntity()));
	}

}
