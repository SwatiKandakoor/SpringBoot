
package com.xworkz.logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccirenceInList {
	
	public static void main(String[] args) {
		int count=0;
		List<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<list.size();i++) {

			if(!map.containsKey(list.get(i))) {
				map.put(list.get(i), 1);
			}
			else {
				count=map.get(list.get(i));
				
				map.put(list.get(i), ++count);
		    }
		//	System.out.println(list.get(i)+" "+count);
			
	}
		
    map.forEach((k,v) -> System.out.println(k + "-> " + v));
			
	
	}
}

/*
 * 
 * 0, 1, 2, 2, 1, 4

map<>
0, 1
1 1
 * 
 * */



