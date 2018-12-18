package com.talant.siconia.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.DevicePageDTO;
import com.talant.siconia.entite.DeviceEntity;

/***
 * 
 * File DeviceUtility.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceUtility.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

public class DeviceUtility {
	
	public static DeviceDTO convertDeviceEntityToDeviceDTO(DeviceEntity deviceEntity) {
		
		DeviceDTO deviceDTO = new DeviceDTO(); 
		
		deviceDTO.setId(deviceEntity.getId());
		deviceDTO.setIdType(deviceEntity.getIdType());
		deviceDTO.setModelNumber(deviceEntity.getModelNumber());
		deviceDTO.setMrid(deviceEntity.getMrid());
		deviceDTO.setPathName(deviceEntity.getPathName());
		deviceDTO.setSerialNumber(deviceEntity.getSerialNumber());
		
		return deviceDTO;
	}
	
	public static DeviceEntity convertDeviceDtoToDeviceEntity(DeviceDTO deviceDTO) {
		
		DeviceEntity deviceEntity = new DeviceEntity();
		
		deviceEntity.setId(deviceDTO.getId());
		deviceEntity.setIdType(deviceDTO.getIdType());
		deviceEntity.setModelNumber(deviceDTO.getModelNumber());
		deviceEntity.setMrid(deviceDTO.getMrid());
		deviceEntity.setPathName(deviceDTO.getPathName());
		deviceEntity.setSerialNumber(deviceDTO.getSerialNumber());
		
		return deviceEntity;
	}
	
	public static DevicePageDTO devicePageDTOfromPageEntity(Page<DeviceEntity> pageDeviceEntity) {
		
		DevicePageDTO devicePageDTO = new  DevicePageDTO();
		
		List<DeviceDTO> deviceDTOs = pageDeviceEntity.getContent().stream().map(deviceEntity -> convertDeviceEntityToDeviceDTO(deviceEntity)).
				collect(Collectors.toList());
		
		devicePageDTO.setContent(deviceDTOs);
		devicePageDTO.setFirst(pageDeviceEntity.isFirst());
		devicePageDTO.setHasNext(pageDeviceEntity.hasNext());
		devicePageDTO.setHasPrevious(pageDeviceEntity.hasPrevious());
		devicePageDTO.setLast(pageDeviceEntity.isLast());
		devicePageDTO.setNumber(pageDeviceEntity.getNumber());
		devicePageDTO.setNumberOfElements(pageDeviceEntity.getNumberOfElements());
		devicePageDTO.setSize(pageDeviceEntity.getSize());
		devicePageDTO.setTotalPages(pageDeviceEntity.getTotalPages());
		
		return devicePageDTO;
	}

}
