package com.talant.siconia.entite;

import java.util.Date;

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

@Entity
@Table(name = "Echange", schema = "UAA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EchangeEntity extends CommonEntity{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
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
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "mRID")
	private DeviceEntity device;
	
}
