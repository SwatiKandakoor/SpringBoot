package com.xworkz.logical;

public class RemoveSpace1 {
  
	public static void main(String[] args) {
		String str = "Hi Vijay How are you!";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);
	}
}
