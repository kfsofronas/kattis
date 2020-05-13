package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NastyHacks {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		String[] input;
		
		for(int i = 0; i < testCases; i++) {
			input = br.readLine().split(" ");
			int r = Integer.parseInt(input[0]);
			int e = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			if((e-c) < r) {
				bw.write("do not advertise\n");
			} else if ((e-c) > r) {
				bw.write("advertise\n");
			} else if ((e-c) == r) {
				bw.write("does not matter\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
