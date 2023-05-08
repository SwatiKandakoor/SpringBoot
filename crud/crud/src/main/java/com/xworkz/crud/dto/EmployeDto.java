package com.xworkz.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeDto {
   
   private String name;
   private String company;
   private Double salary;
   private long phoneNo;
   
}
