package com.xworkz.logical;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,78,9,3,1,7};
		
		for(int i=0;i<arr.length;i++) {
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;

		}
		System.out.println(Arrays.toString(arr));


	}

}
