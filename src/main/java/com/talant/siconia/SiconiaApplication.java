package com.talant.siconia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.service.DeviceService;

/***
 * 
 * File SiconiaApplication.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of SiconiaApplication.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@SpringBootApplication
public class SiconiaApplication implements CommandLineRunner{

	@Autowired
	@Lazy
	DeviceService deviceService;
	
	/*@Autowired
	EchangeRepository echangeRepository;*/
	
	public static void main(String[] args) {
		SpringApplication.run(SiconiaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DeviceDTO device = new DeviceDTO(null, "SAG6547547657", "METER_X_UDC_ASSET_ID", "FLUVIUS", "MONO", "XYZ");
		deviceService.addDevice(device);
		device = new DeviceDTO(null, "SAG6647547658", "METER_X_UDC_ASSET_ID", "FLUVIUS", "MONO", "XYZ");
		deviceService.addDevice(device);
		device = new DeviceDTO(null, "SAG6747547659", "METER_X_UDC_ASSET_ID", "FLUVIUS", "MONO", "XYZ");
		deviceService.addDevice(device);
		List<DeviceDTO> deviceEntities = deviceService.findAllDevices();
		System.out.println("hello from SiconiaApplication.run");
		deviceEntities.forEach(dv ->{
			System.out.println(dv.getMrid());
		});
		
	/*	EchangeEntity echangeEntity = new EchangeEntity(null, "request", "MeterConnectArmed", "1", new Date(), "FLUVIUS", null, "2", new Date(2019, 12,13), new Date(2019, 12,14), device);
		echangeRepository.save(echangeEntity);*/
		
	}
}
