package com.xworkz.logical;

public class FindLargestNumber {

	public static void main(String[] args) {

		int[] a = { 4, 2, 5,6, 1,4, 78,67, 8 };
		//78
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
					
			}

		}
		System.out.println(max);
	}
	

}
