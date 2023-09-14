package com.xworkz.logical;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {
	public static void main(String[] args) {
	String str = "vijayaayikv";
	Set<Character> duplicate=new HashSet<Character>();
	int count =0;
	for (int i = 0; i < str.length(); i++) {
		
		count = 1;
		for (int j = i + 1; j < str.length(); j++) {
			if (str.charAt(i) == str.charAt(j)) {
				count++;			
			}
		}	
		
		if (count > 1) {
			duplicate.add(str.charAt(i));
		}
		
	}
	System.out.println(duplicate);
}
}
