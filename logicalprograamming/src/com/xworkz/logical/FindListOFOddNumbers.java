package com.xworkz.logical;

import java.util.ArrayList;
import java.util.List;

public class FindListOFOddNumbers {
	public static void main(String[] args) {
		int odd = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(29);
		list.add(4);
		list.add(3);
		list.add(7);
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {

				odd++;
			}
		}
		if (odd == list.size()) {
			System.out.println("all number are odd");
		} else {
			System.out.println("all numbers are not odd");
		}

	}
}
