package com.xworkz.logical;

import java.util.HashMap;
import java.util.Map;

public class BinarySearchEx2 {
	public static void main(String[] args) {
		int a[]= {3,6,8,9,9,10,27,56,100,203,302,500};
		int h=a.length-1;
		int l=0;
		int x=9;
		int mid=0;
		boolean isFound=false;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		while(l<=h) {
			
			mid=l+(h-l)/2;
			if(x==a[mid]) {
				isFound=true;
				break;
			}
			else if(x>a[mid]){
				l=mid+1;	
			}
			else if(x<a[mid]) {
				h=mid-1;
			}
		}
		if(isFound) {
			System.out.println("Found the number "+mid);
		}
		else {
		System.out.println(" not found the number "+mid);
		}

	}

}
