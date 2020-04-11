package codeup_basic100;

import java.util.Scanner;

public class basic1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while(true) {
			++i;
			sum += i;
			if(sum >= num) {
				break;
			}	
		}
		System.out.println(i);
	}
}