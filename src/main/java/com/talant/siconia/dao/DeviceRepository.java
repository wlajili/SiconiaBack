package com.talant.siconia.dao;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.talant.siconia.entite.DeviceEntity;

/***
 * 
 * File DeviceRepository.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceRepository.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */


public interface DeviceRepository extends JpaRepository<DeviceEntity, Long>, DeviceDAOCustom{
	
	public Optional<DeviceEntity> findByMrid(String mrid);
	public Optional<Page<DeviceEntity>> findByMridStartsWith (String mrid, Pageable pageable);
}
