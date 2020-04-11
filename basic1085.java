package codeup_basic100;

import java.util.Scanner;

public class basic1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		double sum = 0;
		
		if((h>0 && h<=48000) && (b>0 && b<=32 && b%8==0) 
				&& (c>0 && c<=5) && (s>0 && s<=6000)){
			sum = (double) h*b*c*s;
		}
		double heritz = ((sum/8)/Math.pow(2, 10))/Math.pow(2, 10);
		System.out.printf("%.1f MB",heritz);
	}
}
