package codeup_basic100;

import java.util.Scanner;

public class basic1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}