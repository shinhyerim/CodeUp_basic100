package codeup_basic100;

import java.util.Scanner;

// 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다
// 좀 더 편한 방법 생각해볼것...!

public class basic1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n1 = num / 10000;
		int n2 = (num%10000) / 1000;
		int n3 = (num%1000) / 100;
		int n4 = (num%1000%100) / 10;
		int n5 = (num%1000%100%10) / 1;
		
		System.out.printf("[%d]\n",n1*10000);
		System.out.printf("[%d]\n",n2*1000);
		System.out.printf("[%d]\n",n3*100);
		System.out.printf("[%d]\n",n4*10);
		System.out.printf("[%d]",n5*1);
	}
}