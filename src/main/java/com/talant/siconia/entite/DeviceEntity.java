package com.talant.siconia.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Divice", schema = "UAA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class DeviceEntity extends CommonEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NonNull
	private String mrid;
	@NonNull
	private String idType;
	@NonNull
	private String pathName;
	@NonNull
	private String modelNumber;
	@NonNull
	private String serialNumber;
	
}
