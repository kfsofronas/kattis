package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Kemija {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);

		String[] input = br.readLine().split("");
		
		for(int i = 0; i < input.length; i++) {
			bw.write(input[i]);
			if(input[i].equals("a") || input[i].equals("e") || input[i].equals("i") || input[i].equals("o") || input[i].equals("u")) {
				i+=2;
			}
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
