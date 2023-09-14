package com.xworkz.logical;

import java.util.ArrayList;
import java.util.List;

public class FindListOFOddNumbers2 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(7);
		list.add(9);
		System.out.println(list);

		boolean isOdd = true;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				isOdd = false;
				break;
			}
		}
		if (isOdd) {
			System.out.println("all number are odd");
		} else {
			System.out.println("all numbers are not odd");
		}
	}

}
