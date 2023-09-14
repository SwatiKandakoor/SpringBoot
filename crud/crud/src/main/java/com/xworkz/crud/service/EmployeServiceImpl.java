package com.xworkz.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.xworkz.crud.dto.EmployeDto;
import com.xworkz.crud.entity.EmployeEntity;
import com.xworkz.crud.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private EmployeRepository repository;

	@Override
	public boolean save(EmployeDto dto) {
		EmployeEntity entity = new EmployeEntity();
		BeanUtils.copyProperties(dto, entity);
		this.repository.save(entity);
		System.out.println("Entity is saved " + entity);
		return true;
	}

	@Override
	public List<EmployeDto> findAll() {
		List<EmployeEntity> entities = this.repository.findAll();
		return entities.stream()
				.map(e -> new EmployeDto(e.getId(), e.getName(), e.getCompany(), e.getSalary(), e.getPhoneNo()))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeDto findById(int id) {
		EmployeEntity entity = this.repository.findById(id).orElse(null);
		System.out.println("entityn " + entity);
		EmployeDto dto = new EmployeDto();
		dto.setName(entity.getName());
		dto.setCompany(entity.getCompany());
		dto.setPhoneNo(entity.getPhoneNo());
		dto.setSalary(entity.getSalary());
		System.out.println("dto " + dto);
		return dto;
	}

	@Override
	public void deleteById(int id) {
		this.repository.deleteById(id);

	}

	@Override
	public boolean update(EmployeDto dto) {
		Optional<EmployeEntity> entity = this.repository.findById(dto.getId());
		System.out.println(entity);
		if (entity.isPresent()) {
			EmployeEntity ent = entity.get();
			ent.setName(dto.getName());
			ent.setCompany(dto.getCompany());
			ent.setPhoneNo(dto.getPhoneNo());
			ent.setSalary(dto.getSalary());
			this.repository.save(ent);
			System.out.println(dto);
		}

		return true;
	}

	@Override
	public List<EmployeDto> findByName(String name) {
		List<EmployeDto> listOfDto = new ArrayList<EmployeDto>();
		if (name != null && !name.isEmpty()) {
			List<EmployeEntity> entities = this.repository.findByName(name);
			for (EmployeEntity entity : entities) {
				EmployeDto dto = new EmployeDto();
				dto.setId(entity.getId());
				dto.setName(entity.getName());
				dto.setCompany(entity.getCompany());
				dto.setPhoneNo(entity.getPhoneNo());
				dto.setSalary(entity.getSalary());
				listOfDto.add(dto);
			}

		} else {
			System.err.println("Name is Invalid");
		}
		return listOfDto;
	}

	@Override
	public Page<EmployeEntity> findEmployeeWithPagination(int offset, int pageSize) {
		Page<EmployeEntity> entity = this.repository.findAll(PageRequest.of(offset, pageSize));
		return entity;
	}

	//AOP
	@Override
	public List<EmployeEntity> findEmployeeWithSorting(String field, String dir) {
		List<EmployeEntity> employeEntities = new ArrayList<EmployeEntity>();
		if (dir.equals("asc"))
			employeEntities = this.repository.findAll(Sort.by(field).ascending());
		else if (dir.equals("desc"))
			employeEntities = this.repository.findAll(Sort.by(field).descending());
		
		return employeEntities;
	}

}
