//ngl I dont understand the problem but I'm going to try it anyways
//EDIT: I got it first try esketit

package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class HeartRate {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tc; i++) {
			String[] input = br.readLine().split(" ");
			int b = Integer.parseInt(input[0]);
			double q = Double.parseDouble(input[1]);
			double t = 60/q;
			double bpm = (60*b)/q;
			bw.write(df.format(bpm-t) + " " + df.format(bpm) + " " + df.format(bpm+t) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
