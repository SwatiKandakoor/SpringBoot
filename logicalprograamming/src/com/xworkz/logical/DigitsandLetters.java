package com.xworkz.logical;

import java.util.Scanner;

public class DigitsandLetters {
	public static void main(String[] args) {
		System.out.println("enter the letters");
		Scanner src=new Scanner(System.in);
		String str=src.nextLine();
		str=str.toUpperCase();
		int letters=0;
		int number=0;
		int special=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
			letters++;	
			}
			else if (ch>='0' && ch<='9') {
				number++;
			}
			else  {
				special++;	
			}
		}
		System.out.println("letters :"+letters);
		System.out.println("numbers :"+number);
		System.out.println("special char :"+special);


	}

}
