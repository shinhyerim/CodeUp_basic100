package codeup_basic100;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class basic1084 {
	public static void main(String[] args) throws Exception{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				for(int k=0; k<c; k++) {
					String str = i+" "+j+" "+k+" ";
					bw.write(str+"\n");
				}
			}
		}
		bw.write(Integer.toString(a*b*c));
		bw.close();
	}
}
