package com.xworkz.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SearchElementInArrayList {
	public static void main(String[] args) {
	
		
	
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(90);
		list.add(2);
		list.add(4);
		
		int a = 2;
		boolean isPresent = list.contains(a);
		if(isPresent)
			System.out.println("element is  present");
		else
			System.out.println("element is   not present");
			
		
		
//		System.out.println(list);
//		boolean isPersent=true;	
//		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i)==50) {
//				isPersent=false;
//				System.out.println("element is  present");
//				break;
//			}
//			
//			
//		}
//		if(isPersent) {
//			System.out.println("element is not present");
//		}
		}
	}


