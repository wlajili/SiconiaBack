package com.talant.siconia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.talant.siconia.dao.DeviceRepository;
import com.talant.siconia.entite.DeviceEntity;

@SpringBootApplication
public class SiconiaApplication implements CommandLineRunner{

	@Autowired
	DeviceRepository deviceRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SiconiaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DeviceEntity device = new DeviceEntity("SAG6547547657", "METER_X_UDC_ASSET_ID", "FLUVIUS", "MONO", "XYZ");
		deviceRepository.save(device);
		device = new DeviceEntity("SAG6547547658", "METER_X_UDC_ASSET_ID", "FLUVIUS", "MONO", "XYZ");
		deviceRepository.save(device);
		device = new DeviceEntity("SAG6547547659", "METER_X_UDC_ASSET_ID", "FLUVIUS", "MONO", "XYZ");
		deviceRepository.save(device);
		List<DeviceEntity> deviceEntities = deviceRepository.findAll();
		System.out.println("hello from SiconiaApplication.run");
		deviceEntities.forEach(dv ->{
			System.out.println(dv.getMrid());
		});
	}
}
