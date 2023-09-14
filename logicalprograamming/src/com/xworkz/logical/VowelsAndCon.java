package com.xworkz.logical;

import java.util.Scanner;

public class VowelsAndCon {

	public static void main(String[] args) {

		System.out.println("Enter the Words :");
		Scanner src = new Scanner(System.in);
		String str = src.nextLine();
		int vow = 0;
		int con = 0;
        str=str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vow++;
			} else if (ch >= 'b' && ch <= 'z') {
				con++;
			}
		}
		System.out.println("vow :" + vow);
		System.out.println("con :" + con);

	}

}
