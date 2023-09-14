package com.xworkz.logical;

public class DuplicateInString {
	public static void main(String[] args) {
		String str = "vijayaayikv";
		int count =0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
					//System.out.println(ch);
				}
			}
			if (count > 1 && ch[i] != '0')
				System.out.println(ch[i]);
		}

	}
}
