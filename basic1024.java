package codeup_basic100;

import java.util.Scanner;

public class basic1024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] c_array = new char[30];
		c_array = str.toCharArray();
		for(int i=0; i<c_array.length;i++) {
			System.out.println("\'"+c_array[i]+"\'");
		}
	}
}
