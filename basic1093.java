package codeup_basic100;

import java.util.Scanner;

public class basic1093 {

	public static void main(String[] args) {
		int[] array = new int[24];
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			array[n] = array[n]+1;
		}
		
		for(int i=1; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
