package com.talant.siconia.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.DevicePageDTO;

/***
 * 
 * File DeviceService.java <br>
 * Date 14 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceService.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@Service
@Transactional
public interface DeviceService {

	public List<DeviceDTO> findAllDevices();
	public DevicePageDTO findDevicesByMridStartsWith(String mrid, Pageable pageable);
	public DeviceDTO findDeviceByMrid(String mrid);
	public DeviceDTO addDevice(DeviceDTO deviceDTO);
	
}
