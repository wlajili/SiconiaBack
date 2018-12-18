package com.talant.siconia.entite;


import javax.persistence.Column;
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
/***
 * 
 * File DeviceEntity.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceEntity.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */
@Entity
@Table(name = "T_Divice", schema = "UAA")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class DeviceEntity extends CommonEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_device", updatable = false, nullable = false)
	private Long id;
	@NonNull
	@Column(name = "mr_id", updatable = false, nullable = false)
	private String mrid;
	@NonNull
	@Column(name = "id_type")
	private String idType;
	@NonNull
	@Column(name = "path_name")
	private String pathName;
	@NonNull
	@Column(name = "model_number")
	private String modelNumber;
	@NonNull
	@Column(name = "serial_number")
	private String serialNumber;
	
	
	
}
