package codeup_basic100;

import java.util.Scanner;

// 문자를 입력받아 10진수로 변환하여 출력하기
// ex) 'A' -> 65
public class basic1036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = str.charAt(0);
		System.out.println((int)c);
	}
}
