package codeup_basic100;

import java.util.Scanner;

public class basic1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		double d = 0;
		
		if((w>0 && w<=1024) && (h>0 && h<=1024) &&
				(b>0 && b<=40 && (b%4==0))) {
			d = (double) w*h*b;
		}
		double pixel = ((d/8)/Math.pow(2, 10))/Math.pow(2, 10);
		System.out.printf("%.2f MB", pixel);
	}

}
