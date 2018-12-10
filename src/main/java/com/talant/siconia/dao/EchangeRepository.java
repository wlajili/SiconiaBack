package com.talant.siconia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.talant.siconia.entite.EchangeEntity;

@RepositoryRestResource(path = "/Echanges")
public interface EchangeRepository extends JpaRepository<EchangeEntity, Long>{

}
