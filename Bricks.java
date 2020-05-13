package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bricks {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");
		int h = Integer.parseInt(input[0]);
		int w = Integer.parseInt(input[1]);
		int n = Integer.parseInt(input[2]);
		input = br.readLine().split(" ");
		boolean done = false;
		int currW = w;
		int currH = h;
		int count = 0;
		
		while(!done) {
			currW -= Integer.parseInt(input[count]);
			if (currW == 0) {
				currH--;
				currW = w;
//				bw.write("CURRW = " + currW);
			}
			count++;
			if(count >= n || currH <= 0 || currW < 0) {
				done = true;
			}
		}
		
		if(currH <= 0) {
			bw.write("YES");
		} else {
			bw.write("NO");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
