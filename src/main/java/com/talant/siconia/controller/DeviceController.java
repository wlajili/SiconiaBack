package com.talant.siconia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.DevicePageDTO;
import com.talant.siconia.service.DeviceService;

/***
 * 
 * File DeviceController.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceController.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DeviceController {

	@Autowired
	DeviceService deviceService;
	
	@GetMapping("/devices")
	public List< DeviceDTO> getAllDevices(){
		return deviceService.findAllDevices();
	}
	
	@GetMapping("/devices/{mrid}")
	public DeviceDTO getDevicesById(@PathVariable(name = "mrid") String mrid) {
		return deviceService.findDeviceByMrid(mrid);
	}
	
	@GetMapping(path = "/devicesStartwithMrid/{mrid}")
	public DevicePageDTO getDevicesStartWithMrid(@PathVariable(name = "mrid") String mrid, Pageable pageable){
		return deviceService.findDevicesByMridStartsWith(mrid, pageable);
	}
	
}
