package com.xworkz.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrackerDto {
	
	private int id;
	private String name;
	private double price;
	private int quntity;
	private String company;

}
