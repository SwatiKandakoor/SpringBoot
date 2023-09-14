package com.xworkz.logical;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		System.out.println("Enter the number :");
		Scanner src = new Scanner(System.in);
		int m = src.nextInt();
		System.out.print(1+","+2+",");
	    m = m - 2;
	    int  n=3;
		while (m > 0) {
			boolean isPrime = true;
			for (int i = 2; i <=n/2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(n + ",");
				m--;
			}
			n=n+1;

		}
	}

}
