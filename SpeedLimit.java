package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SpeedLimit {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);

		String[] input = br.readLine().split(" ");
		
		while(Integer.parseInt(input[0]) != -1) {
			int lastTime = 0;
			int distance = 0;
			int cases = Integer.parseInt(input[0]);
			for(int i = 0; i < cases; i++) {
				input = br.readLine().split(" ");
				distance += (Integer.parseInt(input[0])*(Integer.parseInt(input[1])-lastTime));
				lastTime = Integer.parseInt(input[1]);
			}
			bw.write(distance + " miles\n");
			input = br.readLine().split(" ");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
