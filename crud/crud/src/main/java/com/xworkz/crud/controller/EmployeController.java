package com.xworkz.crud.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.crud.dto.EmployeDto;
import com.xworkz.crud.service.EmployeService;

@RestController
@RequestMapping(value="/employe",produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeController {
	
	@Autowired
	private EmployeService employeService;
	
	public EmployeController() {
     System.out.println("Created "+this.getClass().getSimpleName());
}
    
	@PostMapping
	public String onSave(@RequestBody EmployeDto dto) {
		System.out.println("running on save method");
		System.out.println("Saved dto :"+dto);
		boolean saved=this.employeService.save(dto);
		System.out.println("Save success "+saved);
		return "Save success..";
	}
	@GetMapping("/list")
	public List<EmployeDto>  getList(){
		System.out.println("running getList from Employe...");
		return this.employeService.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public EmployeDto onFindById(@PathVariable int id) {
		System.out.println("running on FindById .. Id = " + id);
		EmployeDto dto= this.employeService.findById(id);
		return dto;
	}
}
