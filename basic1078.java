package codeup_basic100;

import java.util.Scanner;

public class basic1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
