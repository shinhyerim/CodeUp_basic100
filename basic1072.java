package codeup_basic100;

import java.util.Scanner;

public class basic1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] array = new int[num];
		
		int i=0;
		
		while(i<array.length) {
			array[i] = sc.nextInt();
			i++;
		}
		
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j]);
		}
	}
}
