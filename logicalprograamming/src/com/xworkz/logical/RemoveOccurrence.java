package com.xworkz.logical;

public class RemoveOccurrence {
	public static void main(String[] args) {
		String str="ABCDEFC";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!='C') {
				System.out.println(ch);
			}
		}
	}
}
