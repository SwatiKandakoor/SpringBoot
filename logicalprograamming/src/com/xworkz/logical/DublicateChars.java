package com.xworkz.logical;

import java.util.HashSet;
import java.util.Set;

public class DublicateChars {

	public static void main(String[] args) {
		String str = "vijayaayikv";
		
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && str.charAt(i) !='0') {
					count++;			
				}
			}	
			
			if (count > 1) {
				System.out.println(str.charAt(i));
				str = str.replace(str.charAt(i), '0');	
			}
				
		}

	}
	
}
