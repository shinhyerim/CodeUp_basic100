package codeup_basic100;

import java.util.Scanner;

// 8진수 입력받아서 10진수로 변경하기
public class basic1034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int i = Integer.valueOf(str, 8); // Integer.valueOf()를 이용해서 8진수로 변경
		System.out.printf("%d",i); // 10진수로 출력
	}
}