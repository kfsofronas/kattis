package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CryptographersConundrum {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		char[] input = br.readLine().toCharArray();
		int count = 0;
		
		for(int i = 0; i < input.length; i++) {
			switch(i%3) {
			case 0:
				if(input[i] != 'P') {
					count++;
				}
				break;
			case 1:
				if(input[i] != 'E') {
					count++;
				}
				break;
			case 2:
				if(input[i] != 'R') {
					count++;
				}
				break;
			}
		}
		bw.write(count + "");

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
