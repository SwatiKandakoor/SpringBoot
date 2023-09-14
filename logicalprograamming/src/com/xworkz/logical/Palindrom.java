package com.xworkz.logical;

public class Palindrom {
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("It is palindrom..");
			
		}
		else {
			System.out.println("It is not a palindrom..");

		}
	}

}
