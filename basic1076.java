package codeup_basic100;

import java.util.Scanner;

public class basic1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);
		char a = 'a';
		do {
			System.out.printf("%c ",a);
			a++;
		}while(a <= c);
	}
}
