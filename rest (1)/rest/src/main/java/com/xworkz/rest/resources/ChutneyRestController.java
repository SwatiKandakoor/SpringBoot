package com.xworkz.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.rest.dto.ChutneyDto;

@RestController
@RequestMapping(value="/chutney",produces = MediaType.APPLICATION_JSON_VALUE)
public class ChutneyRestController {
	public ChutneyRestController() {
	System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@GetMapping
	public ChutneyDto chutneyDto(){
		ChutneyDto  dto= new ChutneyDto(1, "Tomato", "red", true);
		return dto;
	}
    @GetMapping("/list")
    public List<ChutneyDto> onList(){
    	System.out.println("running on list in CrackerDto");
    	List<ChutneyDto> list=new ArrayList<ChutneyDto>();
    	list.add(new ChutneyDto(2, "Pudina", "Green", false));
    	list.add(new ChutneyDto(3, "KempChutney", "red", true));
    	list.add(new ChutneyDto(4, "KayiChutney", "White", true));
    	return list;

    }
    @PostMapping
    public String onSave(ChutneyDto dto) {
    	System.out.println("running on save method");
    	return "save success";
    }
}
