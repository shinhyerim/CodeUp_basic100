package codeup_basic100;

import java.util.Scanner;

public class basic1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] str = s.split(":");
		int hour = Integer.parseInt(str[0]);
		int minute = Integer.parseInt(str[1]);
		int second = Integer.parseInt(str[2]);
		System.out.println(minute);
	}
}