package com.xworkz.crud.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.xworkz.crud.dto.EmployeDto;
import com.xworkz.crud.entity.EmployeEntity;

public interface EmployeService {

	boolean save(EmployeDto dto);

	List<EmployeDto> findAll();

	EmployeDto findById(int id);

	void deleteById(int id);

	boolean update(EmployeDto dto);

	List<EmployeDto> findByName(String name);

	Page<EmployeEntity> findEmployeeWithPagination(int offset, int pageSize);

	List<EmployeEntity> findEmployeeWithSorting(String field, String dir);

}
