package codeup_basic100;

import java.util.Scanner;

public class basic1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			int i = sc.nextInt();
			if(i != 0) {
				System.out.println(i);
				continue;
			}else {
				break;
			}
		}
	}
}
