package com.xworkz.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.rest.dto.CrackerDto;

@RestController
@RequestMapping(value="/cracker",produces = MediaType.APPLICATION_JSON_VALUE)
public class CrackerRestController {
	
	public CrackerRestController() {
	System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public CrackerDto crackerDto() {
		CrackerDto  dto= new CrackerDto(1, "Bisakal", 10, 1, "Sangeetha");
		return dto;
	}
    @GetMapping("/list")
    public List<CrackerDto> onList(){
    	System.out.println("running on list in CrackerDto");
    	List<CrackerDto> list=new ArrayList<CrackerDto>();
    	list.add(new CrackerDto(2,"Atom bomb",30,2,"Kartika"));
    	list.add(new CrackerDto(3,"Susar batti",5,1,"Satvika"));
    	list.add(new CrackerDto(4,"Rocket",100,3,"Kartika"));
    	return list;

    }
    @PostMapping
    public String onSave(CrackerDto crackerDto) {
    	System.out.println("running on save method");
    	return "save success";
    }
}
