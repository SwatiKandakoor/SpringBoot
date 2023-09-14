package com.xworkz.logical;

public class ArraySameElements {
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,78};
		int arr1[] = {29,4,3,1,22};
		
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			if(arr[i]==arr1[j]) {
				System.out.println(arr[i]);
			}
		}
	}
	}

}
