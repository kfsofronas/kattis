package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DiceCup {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		String[] input = br.readLine().split(" ");
		int a = Math.max(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		int b = Math.min(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		
		
		for(int i = 0; i <= a-b; i++) {
			bw.write((b+i+1) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
