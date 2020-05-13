package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PizzaCrust {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");
		int r = Integer.parseInt(input[0]);
		int c = Integer.parseInt(input[1]);
		double p = (double)(r - c);
//		bw.write(r + "\n");
//		bw.write(c + "\n");
//		bw.write(p + "\n");
		
		bw.write((Math.PI*p*p)/(Math.PI*r*r)*100 + "");
		

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
