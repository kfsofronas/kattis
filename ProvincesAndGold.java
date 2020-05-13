package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProvincesAndGold {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		String[] input = br.readLine().split(" ");
		int g = Integer.parseInt(input[0]);
		int s = Integer.parseInt(input[1]);
		int c = Integer.parseInt(input[2]);
		
		int bp = (g*3)+(s*2)+(c*1);
		
		if(bp >= 8) {bw.write("Province or Gold");}
		else if(bp >= 6) {bw.write("Duchy or Gold");}
		else if(bp >= 5) {bw.write("Duchy or Silver");}
		else if(bp >= 3) {bw.write("Estate or Silver");}
		else if(bp >= 2) {bw.write("Estate or Copper");}
		else {bw.write("Copper");}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
