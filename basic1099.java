package codeup_basic100;

import java.util.Scanner;

public class basic1099 {

	public static void main(String[] args) throws Exception {
		int[][] arr = new int[10][10]; // 2차원 배열 선언
		
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) { // 배열의 각 방에 접근
				arr[i][j] = sc.nextInt(); // 값을 입력받아 배열의 각 방에 저장
			} 
		}
		
		// 시작 위치
		int x = 1;
		int y = 1;
		
		boolean status = true;
		
		while(status) {
			for(int a=x; a<arr.length; a++) {
				for(int b=y; b<arr.length; b++) {
					if(arr[a][b] == 0) {
						arr[a][b] = 9;
						y++;
					}else if(arr[a][b] == 1) {
						x++;
						y--;
					}else if(arr[a][b] == 2) {
						arr[a][b] = 9;
						status = false;
					}			
				}
				if(!status) break;
			}
		}
		
		// 2차원 배열 출력
		for(int n=0; n<arr.length; n++) {
			for(int m=0; m<arr.length; m++) {
				System.out.print(arr[n][m]+" ");
			}
			System.out.println();
		}
	}
}