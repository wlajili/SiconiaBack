package com.talant.siconia.dao;

/**
 * File AbstractDAO.java <br>
 * Date 13 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of AbstractDAO.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 **/


public interface AbstractDAO<T,E> {

	public E entityFromDTO(T dto);
	public T dtoFromEntity(E entity);
	
}
