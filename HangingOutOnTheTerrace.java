package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HangingOutOnTheTerrace {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		String[] input = br.readLine().split(" ");
		int f = Integer.parseInt(input[0]);
		int e = Integer.parseInt(input[1]);
		int people = 0;
		int count = 0;
		
		for(int i = 0; i < e; i++) {
			input = br.readLine().split(" ");
			int p = Integer.parseInt(input[1]);
			if(input[0].equals("enter")) {
				if(people+p > f) {
					count++;
				} else {
					people += p;
				}
			} else if(input[0].equals("leave")) {
				people -= p;
			}
		}
		
		bw.write(count + "");

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
