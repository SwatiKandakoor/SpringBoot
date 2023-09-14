package com.xworkz.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.xworkz.crud.entity.EmployeEntity;

@Repository
public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer> {

	List<EmployeEntity> findByName(String name);

	//List<EmployeEntity> findAll(Sort sort);
	
//  EmployeDto findAll(Direction asc, String field);

}
