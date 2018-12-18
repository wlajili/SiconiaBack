package com.talant.siconia.entite;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * File EchangeEntity.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of EchangeEntity.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@Entity
@Table(name = "T_Echange", schema = "UAA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EchangeEntity extends CommonEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name ="id_message", updatable = false, nullable = false)
	private Long messageID;
	@Column(name = "verb")
	private String verb;
	@Column(name = "noun")
	private String noun;
	@Column(name = "revision")
	private String revision;
	@Column(name = "date_Time")
	private Date dateTime;
	@Column(name = "source")
	private String source;
	@Column(name = "reply_Code")
	private String replyCode;
	@Column(name = "request_Priority")
	private String requestPriority;
	@Column(name = "execute_Start_Time")
	private Date executeStartTime;
	@Column(name = "execute_Expire_Time")
	private Date executeExpireTime;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_device")
	private DeviceEntity device;
	
}
