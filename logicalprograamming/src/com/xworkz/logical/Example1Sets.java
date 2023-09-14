package com.xworkz.logical;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Example1Sets{
	public static void main(String[] args) {
		Set<String> name=new HashSet<String>();
		name.add("Swati");
		name.add("Naveen");
		name.add("Sunitha");
		name.add("vani");
		name.add("Kavitha");
		
		Set<String> str=new HashSet<String>();
		str.add("Swati");
		str.add("vani");
		str.add("Vijay");
		str.add("Sahana");
		str.add("Anu");


		name.retainAll(str) ;
			System.out.println(name);
		
	}

	
}
