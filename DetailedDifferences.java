package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DetailedDifferences {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCases; i++) {
			String toPrint = "";
			String l1 = br.readLine();
			String l2 = br.readLine();
			String[] line1 = l1.split("");
			String[] line2 = l2.split("");
			
			for(int a = 0; a < line1.length; a++) {
				if(line1[a].equals(line2[a])) {
					toPrint += ".";
				} else {
					toPrint += "*";
				}
			}
			bw.write(l1 + "\n" + l2 + "\n" + toPrint + "\n\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
