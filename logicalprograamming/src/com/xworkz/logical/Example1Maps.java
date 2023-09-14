package com.xworkz.logical;

import java.util.HashMap;
import java.util.Map;

public class Example1Maps {

	public static void main(String[] args) {
		String str="eabcdabbfhdshvsffsgsggsgshhsjs";
		Map<Character, Integer> map = new HashMap<>();
		 int c =0;
		for(int i = 0; i<str.length(); i++) {
			c++;
			char ch = str.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, ++count);
			}
		}
	
	map.forEach((k,v) -> System.out.println(k + "-> " + v));
	System.out.println(c);
	}
	
}


//n -> n - linear complexity
//n -> n^2 -> 
//
//
//
//n -> linear complexity
//1 2 4 7 23 45 67 89 345 1000
//
//
// 1 10000000
//  600000
//
//
///*
// * 
// * msp<>
// * 
// * e 1
// * a 2
// * b 3
// * c 1
// * d 1
// * 
//*/
