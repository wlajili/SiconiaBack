package com.talant.siconia.mapper;

import com.talant.siconia.DTO.EchangeDTO;
import com.talant.siconia.entite.DeviceEntity;
import com.talant.siconia.entite.EchangeEntity;

public class EchangeUtility {

	public static EchangeDTO convertEchangeEntityToEchangeDTO(EchangeEntity echangeEntity) {
		
		EchangeDTO echangeDTO = new EchangeDTO();
		
		echangeDTO.setDateTime(echangeEntity.getDateTime());
		echangeDTO.setDeviceId(echangeEntity.getDevice().getId());
		echangeDTO.setExecuteExpireTime(echangeEntity.getExecuteExpireTime());
		echangeDTO.setExecuteStartTime(echangeEntity.getExecuteStartTime());
		echangeDTO.setNoun(echangeEntity.getNoun());
		echangeDTO.setReplyCode(echangeEntity.getReplyCode());
		echangeDTO.setRequestPriority(echangeEntity.getRequestPriority());
		echangeDTO.setRevision(echangeEntity.getRevision());
		echangeDTO.setSource(echangeEntity.getSource());
		echangeDTO.setVerb(echangeEntity.getVerb());
		echangeDTO.setMessageID(echangeEntity.getMessageID());
		
		return echangeDTO;
	}
	
	public static EchangeEntity convertEchangeDTOtoEchangeEntity(EchangeDTO echangeDTO, DeviceEntity deviceEntity) {
		
		EchangeEntity echangeEntity = new EchangeEntity();
		
		echangeEntity.setDateTime(echangeDTO.getDateTime());
		echangeEntity.setDevice(deviceEntity);
		echangeEntity.setExecuteExpireTime(echangeDTO.getExecuteExpireTime());
		echangeEntity.setExecuteStartTime(echangeDTO.getExecuteStartTime());
		echangeEntity.setNoun(echangeDTO.getNoun());
		echangeEntity.setReplyCode(echangeDTO.getReplyCode());
		echangeEntity.setRequestPriority(echangeDTO.getRequestPriority());
		echangeEntity.setRevision(echangeDTO.getRevision());
		echangeEntity.setSource(echangeDTO.getSource());
		echangeEntity.setVerb(echangeDTO.getVerb());
		echangeEntity.setMessageID(echangeDTO.getMessageID());
		
		return echangeEntity;
	}
}
