package codeup_basic100;

import java.util.Scanner;

public class basic1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] s = str.split("\\.");
		int i = Integer.parseInt(s[0]);
		float f = Float.parseFloat(s[1]);
		System.out.printf("%d\n%.0f",i,f);
	}
}