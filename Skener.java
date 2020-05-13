package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Skener {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");

		int r = Integer.parseInt(input[0]); // 3
		int c = Integer.parseInt(input[1]); // 3
		int zr = Integer.parseInt(input[2]); // 1
		int zc = Integer.parseInt(input[3]); // 2
		
		for(int i = 0; i < r; i++) {
			String[] sinput = br.readLine().split("");
			String toAdd = "";
			String toPrint = "";
			for(int a = 0; a < c; a++) {
				for(int b = 0; b < zc; b++) {
					toAdd += sinput[a];
				}
			}
			for(int d = 0; d < zr; d++) {
				toPrint += toAdd + "\n";
			}
			bw.write(toPrint + "");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
