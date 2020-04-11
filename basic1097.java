package codeup_basic100;

import java.util.Scanner;

public class basic1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[20][20];
		int n = sc.nextInt();
		int x,y;
		
		for(int i=0; i<arr.length; i++) {
			arr[i][9] = 1;
			arr[i][11] = 1;
			arr[9][i] = 1;
			arr[11][i] = 1;
		}
		
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			for(int j=0; j<arr.length; j++) {
				if(arr[x-1][j] == 1) {
					arr[x-1][j] = 0;
				}else {
					arr[x-1][j] = 1;
				}
				
				if(arr[j][y-1] == 1) {
					arr[j][y-1] = 0;
				}else {
					arr[j][y-1] = 1;
				}
			}
		}
		
		for(int i=0; i<arr.length -1; i++) {
			for(int j=0; j<arr.length -1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}