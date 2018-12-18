package com.talant.siconia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.talant.siconia.entite.EchangeEntity;

@Repository
public interface EchangeRepository extends JpaRepository<EchangeEntity, Long>, EchangeDAOCustum{

}
