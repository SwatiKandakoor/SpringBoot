package com.xworkz.logical;

public class CountFreqDigits {
	public static void main(String[] args) {
		int num=234234562;
		int mod=0 ,count=0;
		
		while(num>0) {
			mod=num%10;
			num=num/10;
			if(mod==3) {
				count++;
			}
		}
		System.out.println("Count the Frequnce of digits :"+count);
		
	}

}
