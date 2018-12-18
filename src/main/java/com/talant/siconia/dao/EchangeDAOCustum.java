package com.talant.siconia.dao;

import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.entite.EchangeEntity;

public interface EchangeDAOCustum extends AbstractDAO<EchangeDTO, EchangeEntity>{

	public EchangeDTO saveEchange(EchangeDTO dto);
	public EchangeDTO findEchangeById(Long id);
	
}
