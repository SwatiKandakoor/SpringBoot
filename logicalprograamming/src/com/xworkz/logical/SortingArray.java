package com.xworkz.logical;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int[] arr = { 2, 34, 67, 2, 4, 7, 1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
}
