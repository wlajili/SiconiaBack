package com.talant.siconia.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.talant.siconia.DTO.DeviceDTO;
import com.talant.siconia.DTO.DevicePageDTO;
import com.talant.siconia.entite.DeviceEntity;

/**
 * File DeviceDAOCustom.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceDAOCustom.java : <br>
 *
 *
 * déclaration des méthodes de JPARepesitory que nous utiliserons <br>
 **/


public interface DeviceDAOCustom extends AbstractDAO <DeviceDTO, DeviceEntity>{

	public DeviceDTO findDeviceByMrid(String mrid);
	public DevicePageDTO findDevicesByMridStartsWith(String mrid, Pageable pageable);
	public DeviceDTO saveDevice(DeviceDTO deviceDTO);
	public List<DeviceDTO> findAllDevices();
	public DeviceDTO findDeviceById(Long id);
	
}
