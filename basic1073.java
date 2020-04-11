package codeup_basic100;

import java.util.Scanner;

public class basic1073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int num = sc.nextInt();
			if(num != 0) {
				System.out.println(num);
				continue;
			}else {
				break;
			}
		}
	}
}
