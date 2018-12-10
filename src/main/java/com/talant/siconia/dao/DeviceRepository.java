package com.talant.siconia.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.talant.siconia.entite.DeviceEntity;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(path = "/Devices")
public interface DeviceRepository extends JpaRepository<DeviceEntity, String>{

	public ArrayList<DeviceEntity> findByMridStartsWith(@Param (value = "mrid")String mrid);
}
