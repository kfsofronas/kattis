package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Railroad {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");
		
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		if(y%2 == 0) {
			bw.write("possible");
		} else {
			bw.write("impossible");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
