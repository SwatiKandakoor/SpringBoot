package com.xworkz.logical;

import java.util.Scanner;

public class Fibonaci {

	public static void main(String[] args) {

		
		int n=1;
		
		while (n != 0) {
			int a = 0;
			int b = 1;
			
			System.out.println("\n enter number to print fibonaci series ,enter 0 to exist");
			Scanner scr = new Scanner(System.in);
			int z = scr.nextInt();
			int c = 0;
			System.out.print(a + ",");
			System.out.print(b + ",");

			for (int i = 0; i < z - 2; i++) {
				// System.out.println((i));
				c = a + b;
				a = b;
				b = c;

				System.out.print(c + ",");

			}
		}

	}

}

