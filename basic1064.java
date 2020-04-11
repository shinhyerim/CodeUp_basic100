package codeup_basic100;

import java.util.Scanner;

public class basic1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a < b ? (a < c ? a : (b < c ? b : c)) : (b < c ? b : c);
		System.out.println(d);
	}
}