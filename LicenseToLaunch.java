package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LicenseToLaunch {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		int length = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] sj = new int[length];
		for(int i = 0; i < length; i++) {
			sj[i] = Integer.parseInt(input[i]);
		}
		
		int smallest = Integer.MAX_VALUE;
		int smallIndex = 0;
		for(int j = 0; j < length; j++) {
			if (sj[j] < smallest) {
				smallest = sj[j];
				smallIndex = j;
			}
		}
		
		bw.write(smallIndex + "");

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
