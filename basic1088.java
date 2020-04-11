package codeup_basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class basic1088 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<=num; i++) {
			if(i%3==0) {
				continue;
			}
			bw.write(String.valueOf(i)+" ");	
		}
		bw.close();
	}
}