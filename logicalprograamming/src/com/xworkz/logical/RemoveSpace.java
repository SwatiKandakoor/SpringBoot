package com.xworkz.logical;

public class RemoveSpace {
	public static void main(String[] args) {
		String str = "Hi Vijay How are you!";
		String[] st = str.split(" ");
		String result = "";
		for (int i = 0; i < st.length; i++) {
			result = result + st[i];
		}
		System.out.println(result);
	}

}
