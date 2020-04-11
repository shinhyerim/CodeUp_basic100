package codeup_basic100;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class basic1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String[] s = str.split("\\.");
		
		int sYear = Integer.parseInt(s[0]);
		int sMonth = Integer.parseInt(s[1]);
		int sDay = Integer.parseInt(s[2]);
		
		System.out.printf("%02d-%02d-%04d",sDay,sMonth,sYear);
	}
}