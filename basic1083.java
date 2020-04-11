package codeup_basic100;

import java.util.Scanner;

public class basic1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1;
		while(true) {
			if(i>num) {
				break;
			}
			if(i%3 != 0) {
				System.out.printf("%d ",i);
			}else {
				System.out.printf("X ");
			}
			i++;
		}
	}
}
