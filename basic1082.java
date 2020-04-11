package codeup_basic100;

import java.util.Scanner;

public class basic1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(16); // 16 = 16진수, 8 = 8진수
		
		for (int i=1; i<=15; i++) {
			System.out.printf("%X*%X=%X \n",num,i,num*i);
			// x = 소문자로 된 16진수, X = 대문자로 된 16진수
		}
	}
}
