package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class QALY {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);

		DecimalFormat df = new DecimalFormat("0.000");
		
		int periods = Integer.parseInt(br.readLine());
		double qaly = 0.0;
		
		for(int i = 0; i < periods; i++) {
			String[] in = br.readLine().split(" ");
			qaly += Double.parseDouble(in[0])*Double.parseDouble(in[1]);
		}
		
		bw.write(df.format(qaly));
		
//		double[][] input = new double[2][periods];
		
//		double lifeLength = 0;
//		for(double[] d : input) {
//			String[] i = br.readLine().split(" ");
//			d[0] = Double.parseDouble(i[0]);
//			d[1] = Double.parseDouble(i[1]);
//			lifeLength += d[1];
//		}
//		
//		double qaly = 0;
//		for(double[] d : input) {
//			qaly += d[0] * (d[1]/lifeLength);
//		}
		
//		bw.write(qaly + "");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
