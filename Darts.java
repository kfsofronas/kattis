package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Darts {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tc; i++) {
			int tosses = Integer.parseInt(br.readLine());
			int score = 0;
			for(int a = 0; a < tosses; a++) {
				String[] input = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				if(x == 0 && y == 0) {
					score += 10;
				} else if (Math.sqrt(x*x + y*y) <= 200){
					score += (int) 11-(Math.sqrt(x*x + y*y))/20;
				}
			}
			bw.write(score + "");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
