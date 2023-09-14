package com.xworkz.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Swati", 428);
		map.put("Naveen", 256);
		map.put("Vijay", 769);
		map.put("Kavitha", 432);

		Map<String, Integer> sortedByvalue = new LinkedHashMap<String, Integer>();
		// get the entry set
		Set<Entry<String, Integer>> entryset = map.entrySet();
		System.out.println(entryset);
		// create a list since the set is unordered
		List<Entry<String, Integer>> entrylist = new ArrayList<Map.Entry<String, Integer>>(entryset);
		// sort the list by value
		entrylist.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		System.out.println(entrylist);
		// populate the new hash map
		for (Entry<String, Integer> e : entrylist) {
			sortedByvalue.put(e.getKey(),e.getValue());
		}
		System.out.println(sortedByvalue.values());

	}

}
