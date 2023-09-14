package com.xworkz.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,58,9};
		List<Integer> list=new ArrayList<Integer>();
		Arrays.stream(arr).forEach(a -> list.add(a));
	    System.out.println(list);
	
	
	
	List<Integer> l=new ArrayList<Integer>();
	l.add(12);
	l.add(1);
	l.add(4);
	l.add(5);
	
	
	Object[] obj=l.toArray();
	
	for(Object a:obj) {
		System.out.print(a+ " ");
	}
	}

}
