package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarArrangements {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int stars = Integer.parseInt(br.readLine());
		
		bw.write(stars + ":\n");
		
		for(int a = 2; a <= stars/2 + 1; a++) {
			for(int b = a-1; b <= a; b++) {
				if(stars%(a+b) == 0 || (stars-a)%(a+b) == 0) {
					bw.write(a + "," + b + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
