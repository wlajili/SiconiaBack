package com.talant.siconia.entite;


import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * File CommonEntity.java <br>
 * Date 11 juin. 2015 <br>
 * Author "Rachid KRAIEM" <br>
 * Description of CommonEntity.java : <br>
 *
 *
 * This copyright notice should not be removed <br>
 **/

@MappedSuperclass
public abstract class CommonEntity implements Serializable {

	/** The Constant CHARACTER_255. */
	protected static final int CHARACTER_255 = 255;

	/** The Constant CHARACTER_20. */
	protected static final int CHARACTER_20 = 20;
	
	/** The Constant CHARACTER_10. */
	protected static final int CHARACTER_10 = 10;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	
	public CommonEntity() {
		super();
	}

}
