package com.xworkz.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChutneyDto {
	
	private int id;
	private String name;
	private String color;
	private boolean tasty;

}
