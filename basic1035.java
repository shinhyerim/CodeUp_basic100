package codeup_basic100;

import java.util.Scanner;

public class basic1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = Integer.valueOf(str, 16);
		System.out.printf("%o",i);
	}
}
