package com.talant.siconia.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.DevicePageDTO;
import com.talant.siconia.dao.DeviceDAOCustom;
import com.talant.siconia.dao.DeviceRepository;
import com.talant.siconia.entite.DeviceEntity;
import com.talant.siconia.mapper.DeviceUtility;

/***
 * 
 * File DeviceDAOimpl.java <br>
 * Date 14 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceDAOimpl.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */


public class DeviceRepositoryImpl implements DeviceDAOCustom{

	@Autowired
	@Lazy
	@Qualifier("deviceRepository")
	DeviceRepository deviceRepository;


	@Override
	public DeviceEntity entityFromDTO(DeviceDTO dto) {
	/*	ModelMapper model = new ModelMapper();
		DeviceEntity deviceEntity = new DeviceEntity();
		 model.map(dto, deviceEntity);*/
		return DeviceUtility.convertDeviceDtoToDeviceEntity(dto);
	}

	@Override
	public DeviceDTO dtoFromEntity(DeviceEntity entity) {
		
		return DeviceUtility.convertDeviceEntityToDeviceDTO(entity);
		
	}

	@Override
	public DeviceDTO findDeviceByMrid(String mrid) {
		
		Optional<DeviceEntity> device = deviceRepository.findByMrid(mrid);
		if (device.isPresent()) {
			return dtoFromEntity(device.get());
		}
		
		return null;
		
	}

	@Override
	public DevicePageDTO findDevicesByMridStartsWith(String mrid, Pageable pageable) {
		
		Page<DeviceEntity> pageDevice = deviceRepository.findByMridStartsWith(mrid, pageable).orElse(null);
		return DeviceUtility.devicePageDTOfromPageEntity(pageDevice);
	
	}

	@Override
	public DeviceDTO saveDevice(DeviceDTO deviceDTO) {
		
		DeviceEntity deviceEntity = entityFromDTO(deviceDTO);
		return dtoFromEntity(deviceRepository.save(deviceEntity));
	
	}

	@Override
	public List<DeviceDTO> findAllDevices() {
		
		return deviceRepository.findAll().stream().map(this::dtoFromEntity).collect(Collectors.toList());
		
	}

	@Override
	public DeviceDTO findDeviceById(Long id) {
		
		return dtoFromEntity(deviceRepository.findById(id).orElse(new DeviceEntity()));
		
	}

}
