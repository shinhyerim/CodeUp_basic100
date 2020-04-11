package codeup_basic100;

import java.util.Scanner;

public class basic1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = a + b + c;
		double avg = s / 3.0;
		System.out.println(s);
		System.out.printf("%.1f",avg);
	}
}