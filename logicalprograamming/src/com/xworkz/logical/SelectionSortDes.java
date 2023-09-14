package com.xworkz.logical;

import java.util.Arrays;

public class SelectionSortDes {
	public static void main(String[] args) {

		int[] arr = { 1, 5, 7, 9, 2, 3, 0 };

		for (int i = 0; i < arr.length; i++) {
			//int max = arr[i];
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[index]) {
					//max = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));


	}

}
