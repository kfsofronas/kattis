package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StandOnZanzibar {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCases; i++) {
		
			String[] input = br.readLine().split(" ");
			
			int index = 0;
			int temp = Integer.parseInt(input[1]);
			int last = Integer.parseInt(input[0]);
			int count = 0;
			
			while(temp != 0) {
				if(temp > last*2) {
					count += temp - (last*2);
				}
				index++;
				last = Integer.parseInt(input[index]);
				temp = Integer.parseInt(input[index+1]);
			}
			bw.write(count + "\n");
			
		}		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
