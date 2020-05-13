package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Oddities {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		int temp;
		
		for(int i = 0; i < testCases; i++) {
			temp = Integer.parseInt(br.readLine());
			if(temp%2 == 0) {
				bw.write(temp + " is even\n");
			} else {
				bw.write(temp + " is odd\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
