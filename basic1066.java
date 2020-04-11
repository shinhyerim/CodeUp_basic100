package codeup_basic100;

import java.util.Scanner;

public class basic1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=0) {
			if(a%2==0) System.out.println("even");
			else System.out.println("odd");
		}
		if(b>=0) {
			if(b%2==0) System.out.println("even");
			else System.out.println("odd");
		}
		if(c>=0) {
			if(c%2==0) System.out.println("even");
			else System.out.println("odd");
		}
	}
}