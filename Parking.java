package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Parking {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for(int a = 0; a < n; a++) {
				int curr = Integer.parseInt(input[a]);
				if(curr < min) {
					min = curr;
				}
				if(curr > max) {
					max = curr;
				}
			}
			bw.write((max-min)*2 + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
