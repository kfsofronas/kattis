package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class GrassSeedInc {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		DecimalFormat df = new DecimalFormat("0.0000000");
		
		double cost = Double.parseDouble(br.readLine());
		int testCases = Integer.parseInt(br.readLine());
		String[] widthHeight;
		double price = 0.0;
		
		for(int i = 0; i < testCases; i++) {
			widthHeight = br.readLine().split(" ");
			price += (Double.parseDouble(widthHeight[0]) * Double.parseDouble(widthHeight[1]))*cost;
		}
		
		bw.write(df.format(price));

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
