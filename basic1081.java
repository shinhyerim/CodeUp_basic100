package codeup_basic100;

import java.util.Scanner;

public class basic1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		for(int i=1; i<=one; i++) {
			for(int j=1; j<=two; j++) {
				System.out.printf("%d %d\n",i,j);
			}
		}
	}
}