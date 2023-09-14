package com.xworkz.logical;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {
	
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		List<Integer> revList=new LinkedList<Integer>();
		list.add(39);
		list.add(9);
		list.add(89);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--) {
			revList.add(list.get(i));
			
		}
		System.out.print(revList);
		

	}

}
