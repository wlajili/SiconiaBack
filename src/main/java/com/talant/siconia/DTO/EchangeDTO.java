package com.talant.siconia.DTO;

import java.util.Date;

import lombok.Data;

/***
 * 
 * File EchangeDTO.java <br>
 * Date 17 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of EchangeDTO.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@Data
public class EchangeDTO {

	private Long messageID;
	private String verb;
	private String noun;
	private String revision;
	private Date dateTime;
	private String source;
	private String replyCode;
	private String requestPriority;
	private Date executeStartTime;
	private Date executeExpireTime;
	private Long deviceId;
}
