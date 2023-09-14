package com.xworkz.crud.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.xworkz.crud.dto.EmployeDto;
import com.xworkz.crud.entity.EmployeEntity;
import com.xworkz.crud.service.EmployeService;

@RestController
@RequestMapping(value = "/employe", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeController {

	// pagination
	@Autowired
	private EmployeService employeService;

	public EmployeController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(@RequestBody EmployeDto dto) {
		System.out.println("running on save method");
		System.out.println("Saved dto :" + dto);
		boolean saved = this.employeService.save(dto);
		System.out.println("Save success " + saved);
		return "Save success..";
	}

	@GetMapping("/list")
	public List<EmployeDto> getList() {
		System.out.println("running getList from Employe...");
		return this.employeService.findAll();
	}

	@GetMapping("/{id}")
	public EmployeDto onFindById(@PathVariable int id) {
		System.out.println("running on FindById .. Id = " + id);
		EmployeDto dto = this.employeService.findById(id);
		return dto;
	}

	@DeleteMapping("/{id}")
	public String ondeleteById(@PathVariable int id) {
		System.out.println("running on delete by Id= " + id);
		this.employeService.deleteById(id);
		return ("Deleted successfuly " + id);
	}

	@PutMapping
	public String onupdate(@RequestBody EmployeDto dto) {
		this.employeService.update(dto);
		return "updated  data";

	}

	@GetMapping("/findByName/{name}")
	public String findByName(@PathVariable String name) {
		List<EmployeDto> dto = this.employeService.findByName(name);
		return "Find by name " + dto;
	}

	@GetMapping("/pagination/{offset}/{pageSize}")
	public  Page<EmployeEntity> onEmployeWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<EmployeEntity> pagination = this.employeService.findEmployeeWithPagination(offset, pageSize);
		return  pagination;
	}
	
	@GetMapping("/sort")
	public  List<EmployeEntity> onEmployeWithSort(@RequestParam String field, @RequestParam String dir ) {
		List<EmployeEntity> employeEntities = this.employeService.findEmployeeWithSorting(field, dir);
		return  employeEntities;
	}

}