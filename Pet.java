package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pet {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int highest = 0;
		int temp;
		int highestCount = 0;
		String[] scores;
		
		for(int i = 1; i <= 5; i++) {
			temp = 0;
			scores = br.readLine().split(" ");
			for(int a = 0; a < 4; a++) {
				temp += Integer.parseInt(scores[a]);
			}
			if(temp > highest) {
				highest = temp;
				highestCount = i;
			}
		}
		
		bw.write(highestCount + " " + highest);
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
