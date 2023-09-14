package com.xworkz.logical;

import java.util.ArrayList;
import java.util.List;

public class MergaTwoList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(4);
		list.add(1);
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(5);
		list1.add(8);
		
		List<Integer> merga=new ArrayList<Integer>(list);
		merga.addAll(list1);
		System.out.println(merga);
		
		
	}

}
