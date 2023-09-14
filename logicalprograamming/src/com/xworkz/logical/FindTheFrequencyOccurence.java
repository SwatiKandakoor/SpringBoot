package com.xworkz.logical;

import java.util.HashMap;
import java.util.Map;

public class FindTheFrequencyOccurence {

	public static void main(String[] args) {

		String str = "madam";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, ++count);
			}
		}
		map.forEach((k,v)->System.out.println(k+"->"+v));

	}

}
