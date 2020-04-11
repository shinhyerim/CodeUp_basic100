package codeup_basic100;

import java.util.Scanner;

public class basic1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			if(!str.equals("q")) {
				System.out.println(str);
				continue;
			}else {
				System.out.println(str);
				break;
			}
		}
	}
}
