package com.xworkz.logical;

public class LeadingAndTrailingSpace {
	public static void main(String[] args) {
		String str="      Swati    Vijay     ";
		String result=str.strip();
		String leading=str.stripLeading();
		String trailing= str.stripTrailing();
		System.out.println(result);
		System.out.println(leading);
		System.out.println(trailing);

	}

}
