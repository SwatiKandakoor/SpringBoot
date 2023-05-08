package com.xworkz.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xworkz.crud.entity.EmployeEntity;

public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer>{
}
