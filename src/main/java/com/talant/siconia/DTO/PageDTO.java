package com.talant.siconia.DTO;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 * 
 * File PageDTO.java <br>
 * Date 17 déc. 2018 <br>
 * Author "Wajdi Lajili" <br>
 * Description of PageDTO.java : <br>
 *
 *
 * This copyright notice should not be removed  <br>
 *
 */

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class PageDTO <T> {

	private List<T> content;

	private int number;

	private int numberOfElements;

	private int size;

	private int totalPages;

	private boolean hasPrevious;

	private boolean hasNext;

	private boolean isFirst;

	private boolean isLast;
}
