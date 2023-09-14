package com.xworkz.logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) throws CustomException {
		System.out.println("enter the number");
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		
		if(n<0)
			throw new CustomException("Number should be greater than 0");
		
		boolean isPrime = true;
		for (int i = 2; i <=n/2; i++) {
			if (n % i == 0) {
				System.out.println("it is not prime number divisible by:"+i);
				isPrime = false;
				break;
			}

		}
		
		if(isPrime)
			System.out.print("prime number");

	}
}
