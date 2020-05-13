package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RacingAroundTheAlphabet {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		int tc = Integer.parseInt(br.readLine());
		char[] str;
		int ind;
		int prevInd;
		double arcLength;
		double totalArcLength;
		final int RADIUS = 30;
		
		for(int i = 0; i < tc; i++) {
			str = br.readLine().toCharArray();
			prevInd = -1;
			totalArcLength = 0;
			for(char c : str) {
				ind = (int)c;
				if(ind == 32) {
					ind = 26;
				} else if (ind == 39) {
					ind = 27;
				} else {
					ind -= 65;
				}
				if (prevInd == -1) {prevInd = ind;}
				arcLength = (Math.abs(ind-prevInd)/(2*Math.PI))*RADIUS;
				totalArcLength += arcLength;
			}
			bw.write((totalArcLength/15) + str.length + "\n");
		}

//		bw.write((int)'A' + "\n");
//		bw.write((int)'Z' + "\n"); 
//		bw.write((int)'\'' + "\n");
//		bw.write((int)' ' + "\n");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
