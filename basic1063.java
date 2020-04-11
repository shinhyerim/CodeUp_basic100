package codeup_basic100;

import java.util.Scanner;

// 삼항연산
// 조건식 ? 참일때 값 : 거짓일 때 값
public class basic1063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d",a > b? a : b);
	}
}