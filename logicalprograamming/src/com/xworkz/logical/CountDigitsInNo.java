package com.xworkz.logical;

public class CountDigitsInNo {
	public static void main(String[] args) {
		int num = 12345;
		int count = 0;
		int mod = 0;
		int rev = 0;

		while (num > 0) {
			mod = num % 10;
			num = num / 10;
			rev = rev *10+mod;
			count++;

		}
		System.out.println("Reverse Number :"+rev);

		System.out.println("Count the digits :"+count);
	}

}
