package com.xworkz.logical;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2Maps {
	
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1234, "Vijay");
		map.put(2345, "Swati");
		map.put(3456, "Naveen");
		map.put(7889, "kavitha");
		map.put(1256, "Vani");
		map.put(1239, "Vijay");
		map.put(2378, "Swati");
		map.put(3498, "Sunitha");
		map.put(7800, "Sahana");
		map.put(1298, "Vani");
		
		System.out.println(map);
		for(Integer entry:map.keySet()) {
			System.out.println(entry);
		}
		System.out.println("--------------------");
		for(String name:map.values()) {
			System.out.println(name);
		}
		System.out.println("--------------------");

		for(Map.Entry<Integer,String>entries:map.entrySet()) {
			System.out.println(entries.getKey()+"->"+entries.getValue());
		}
	}
		
}
