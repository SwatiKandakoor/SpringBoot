package com.xworkz.logical;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		int a[] = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
		Scanner sc = new Scanner(System.in);
		int n = 5;
		while (true) {
			System.out.println("entr element to find : enter 0 to exit");
			int x = sc.nextInt();
			if (x == 0) {
				break;
			}

			int l = 0;
			boolean isFound = false;
			int h = a.length - 1;

			while (l <= h) {
				int mid = l + (h - l) / 2;
				if (x == a[mid]) {
					isFound = true;
					break;
				} else if (x < a[mid]) {
					h = mid - 1;
				} else {
					l = mid + 1;
				}

			}

			if (isFound) {
				System.out.println("Element found");
			} else
				System.out.println("not found");
		}
	}
}
