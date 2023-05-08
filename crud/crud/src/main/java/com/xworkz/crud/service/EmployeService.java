package com.xworkz.crud.service;

import java.util.List;

import com.xworkz.crud.dto.EmployeDto;

public interface EmployeService {
	
	boolean save(EmployeDto dto);
	
	List<EmployeDto> findAll();
	
	default  EmployeDto findById(int id) {
		return null;
		
	}

}
