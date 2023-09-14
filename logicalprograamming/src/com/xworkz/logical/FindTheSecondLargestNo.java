package com.xworkz.logical;

public class FindTheSecondLargestNo {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int Lar=arr[0];
		int secLar=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>Lar) {
				secLar=Lar;
				Lar=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secLar && arr[i]!=Lar) {
				secLar=arr[i];
			}
		}
		System.out.println(secLar);
	}

}
