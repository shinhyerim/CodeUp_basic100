package codeup_basic100;

import java.util.Scanner;

public class basic1041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);
		int i = (int) c;
		i += 1;
		System.out.println((char)i);
	}
}
