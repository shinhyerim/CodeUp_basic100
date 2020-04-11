package codeup_basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class basic1090 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = bf.readLine().split(" ");
		
		long a = Integer.parseInt(str[0]);
		int d = Integer.parseInt(str[1]);
		int n = Integer.parseInt(str[2]);
		
		for(int i=0; i<n-1; i++) {
			a *= d;
		}
		System.out.println(a);
	}
}