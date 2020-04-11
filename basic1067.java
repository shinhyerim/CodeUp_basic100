package codeup_basic100;

import java.util.Scanner;

public class basic1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		
		if(a >=0 ) {
			System.out.println("plus");
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else {
			System.out.println("minus");
			if(a%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}
	}
}