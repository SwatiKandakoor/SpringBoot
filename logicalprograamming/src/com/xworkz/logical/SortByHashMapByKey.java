package com.xworkz.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortByHashMapByKey {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sunith", 1);
		map.put("Kavitha", 2);
		map.put("Basu", 3);
		map.put("Sahana", 4);

		Map<String, Integer> sortedByKey = new LinkedHashMap<String, Integer>();

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);

		List<Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(entrySet);
		entryList.sort((x, y) -> x.getKey().compareTo(y.getKey()));
		System.out.println(entryList);

		for (Entry<String, Integer> entry : entryList) {
			sortedByKey.put(entry.getKey(), entry.getValue());

		}
		System.out.println(sortedByKey.keySet());
	}

}
