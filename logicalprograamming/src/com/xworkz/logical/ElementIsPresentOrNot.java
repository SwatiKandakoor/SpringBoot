package com.xworkz.logical;

import java.util.HashSet;
import java.util.Set;

public class ElementIsPresentOrNot {
	public static void main(String[] args) {
		Set< Integer> set=new HashSet<Integer>();
		set.add(45);
		set.add(67);
		set.add(89);
		set.add(9);
		
		int a=11;
		boolean isPersent=set.contains(a);
		if(isPersent) {
			System.out.println("element is present");
		}
		else {
			System.out.println("element is not present");

		}
	}

}
