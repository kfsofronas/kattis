package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BabyBites {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		br.readLine();
		String[] input = br.readLine().split(" ");
		boolean correct = true;
		
		for(int i = 0; i < input.length; i++) {
			if(!input[i].equals("mumble") && !(Integer.parseInt(input[i]) == i+1)) {
				correct = false;
				break;
			}
		}
		
		if(correct) {
			bw.write("makes sense");
		} else {
			bw.write("something is fishy");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
