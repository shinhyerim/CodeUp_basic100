package codeup_basic100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class basic1087 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(bf.readLine());
		int sum = 0, i = 0;
		while(true) {
			++i;
			sum += i;
			if(sum >= num) {
				break;
			}	
		}
		bw.write(String.valueOf(sum));
		bw.close();
	}
}
