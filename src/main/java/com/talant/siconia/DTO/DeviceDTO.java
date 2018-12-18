package com.talant.siconia.DTO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * File DeviceDTO.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of DeviceDTO.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DeviceDTO {

	private Long id;
	private String mrid;
	private String idType;
	private String pathName;
	private String modelNumber;
	private String serialNumber;
	
}
