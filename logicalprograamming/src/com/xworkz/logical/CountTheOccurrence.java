package com.xworkz.logical;

public class CountTheOccurrence {
	public static void main(String[] args) {
		String str="eabcdabbsushshshshetrrtryfhfnfffakakakahshs";
		int count=0;
		int c=0;
		for(int i=0;i<str.length();i++) {
			count =1;
			for(int j=i+1;j<str.length();j++)
			{
				c++;
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				}
			System.out.println(str.charAt(i)+" "+count);
			}
		System.out.println(c);
	}
	
}

/*
e ->1
a->2
b->2
c->1
d->1

 *
 */
