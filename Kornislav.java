package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Kornislav {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		String[] input = br.readLine().split(" ");
		int[] lengths = new int[4];
		for(int i = 0; i < 4; i++) {
			lengths[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(lengths);
		bw.write(lengths[0]*lengths[2] + "");

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
