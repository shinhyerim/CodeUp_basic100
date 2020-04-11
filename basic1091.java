package codeup_basic100;

import java.util.Scanner;

public class basic1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=0; i<n-1; i++) {
			a = a*m+d;
		}
		System.out.println(a);
	}

}
