package com.xworkz.crud.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.xworkz.crud.dto.EmployeDto;
import com.xworkz.crud.entity.EmployeEntity;
import com.xworkz.crud.repository.EmployeRepository;
@Service
public class EmployeServiceImpl implements EmployeService{
	
	@Autowired
	private EmployeRepository repository;

	@Override
	public boolean save(EmployeDto dto) {
		EmployeEntity entity=new EmployeEntity();
		BeanUtils.copyProperties(dto, entity);
		this.repository.save(entity);
		System.out.println("Entity is saved "+entity);
		return true;
	}

	@Override
	public List<EmployeDto> findAll() {
		List<EmployeEntity> entities=this.repository.findAll();
		return entities.stream().map(e->new EmployeDto( e.getName(), e.getCompany(), e.getSalary(), e.getPhoneNo()))
				.collect(Collectors.toList());
	}
	@Override
	public EmployeDto findById(int id) {
		EmployeEntity entity= this.repository.findById(id).orElse(null);
		System.out.println("entityn "+entity);
		EmployeDto dto = new EmployeDto();
		dto.setName(entity.getName());
		dto.setCompany(entity.getCompany());
		dto.setPhoneNo(entity.getPhoneNo());
		dto.setSalary(entity.getSalary());
		System.out.println("dto "+dto);
		return dto;
	}

}
