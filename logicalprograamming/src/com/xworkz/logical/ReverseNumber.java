package com.xworkz.logical;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("enter the number :");
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int m = 0;
		int rev = 0;
		while (n > 0) {
			m = n % 10;
			n = n / 10;
			rev = rev * 10 + m;

		}
		System.out.println(rev);
	}

}
