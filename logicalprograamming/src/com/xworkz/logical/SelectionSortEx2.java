package com.xworkz.logical;

import java.util.Arrays;

public class SelectionSortEx2 {
	public static void main(String[] args) {
		 int n[]= {2,4,6,3,1,9,8};
		 
		 for(int i=0;i<n.length;i++) {
			 int min=n[i];
			 int index=i;
			 
			 for(int j=i+1;j<n.length;j++) {
				 if(min>n[j]) {
					 min=n[j];
					 index=j;
					// System.out.println(min);
				 }
				 int temp=n[i];
				 n[i]=n[index];
				 n[index]=temp;
			 }
		

		 }
		 System.out.println(Arrays.toString(n));


		 
	}

}
