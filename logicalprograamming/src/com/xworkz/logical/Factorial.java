package com.xworkz.logical;

public class Factorial {
	public static void main(String[] args) {
		int a=3;
		int fact=1;
		for(int i=1;i<=a;i++) {
			System.out.println(i);
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
