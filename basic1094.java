package codeup_basic100;

import java.util.Scanner;

public class basic1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			int r = sc.nextInt();
			arr[i] = r;
		}
		
		for(int i=arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
