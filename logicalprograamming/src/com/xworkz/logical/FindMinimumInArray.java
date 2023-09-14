package com.xworkz.logical;

public class FindMinimumInArray {
// public static void main(String[] args) {
//	int a[]= {2,4,8,9,4,3};
//	int min=a[0];
//	for(int i=0;i>a.length;i++) {
//		if(a[0]<min) {
//			min=a[i];
//		}
//	}
//	System.out.println(min);
//}
    
     public static void print_pattern()
     {
          /* Function to print the pattern */
        int n=5;
          for(int i=0;i<=n;i++){
              for(int j=0;j<=i;j++){
                  System.out.print("*"+"");
              }
              System.out.println();
          }
     }
      public static void main(String[]args)
     {
         print_pattern();
     }
 }

