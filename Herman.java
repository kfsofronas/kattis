package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Herman {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		DecimalFormat df = new DecimalFormat("0.000000");
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write(df.format(Math.PI*n*n) + "\n");
		bw.write(df.format(Math.pow((2*n)/(Math.sqrt(2)), 2)));

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
