package codeup_basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class basic1098 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] wh = bf.readLine().split(" ");
		int w = Integer.parseInt(wh[0]);
		int h = Integer.parseInt(wh[1]);
		
		int[][] arr = new int[w+1][h+1];
		
		int l,d,x,y;

		int n = Integer.parseInt(bf.readLine());
		for(int i=1; i<=n; i++) {
			String[] str = bf.readLine().split(" ");
			l = Integer.parseInt(str[0]);
			d = Integer.parseInt(str[1]);
			x = Integer.parseInt(str[2]);
			y = Integer.parseInt(str[3]);

			int cnt;
			
			for(cnt=0; cnt<l; cnt++) {
				if(d==0) arr[x][y+cnt] = 1;
				else arr[x+cnt][y] = 1;
			}
		}
		
		// 생성된 배열의 길이가 아니라 입력받은 w,h를 넣어주어야 ArrayIndexOutOfBoundsException이 발생하지 않음
		for(int i=1; i<=w; i++) {
			for(int j=1; j<=h; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}