package com.talant.siconia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.DevicePageDTO;
import com.talant.siconia.dao.DeviceRepository;
import com.talant.siconia.service.DeviceService;

/***
 * 
 * File DeviceServiceImpl.java <br>
 * Date 14 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceServiceImpl.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@Service
public class DeviceServiceImpl implements DeviceService{

	@Autowired
	@Lazy
	@Qualifier("deviceRepository")
	private DeviceRepository deviceRepository;
	
	@Override
	public List<DeviceDTO> findAllDevices() {
		return deviceRepository.findAllDevices();
	}

	@Override
	public DevicePageDTO findDevicesByMridStartsWith(String mrid, Pageable pageable) {
		return deviceRepository.findDevicesByMridStartsWith(mrid, pageable);
	}

	@Override
	public DeviceDTO findDeviceByMrid(String mrid) {
		return deviceRepository.findDeviceByMrid(mrid);
	}

	@Override
	public DeviceDTO addDevice(DeviceDTO deviceDTO) {
		return deviceRepository.saveDevice(deviceDTO);
	}

}
