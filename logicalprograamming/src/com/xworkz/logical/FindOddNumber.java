package com.xworkz.logical;

public class FindOddNumber {
	public static void main(String[] args) {
		 int[] a= {9,3,7};
		 int even=0;
		 int odd=0;
		 
		for(int i=0;i<a.length;i++) {
		if (a[i] % 2 == 0) {
			even++;
		} else {
			odd++;
		}

	}
		System.out.println("even :"+even);
		System.out.println("odd :"+odd);
		if(odd==a.length) {
		System.out.println("all numbers are odd ");	
		}
		else {
			System.out.println("all numbers are not odd");
		}

}

}
