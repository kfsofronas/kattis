package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickBrownFox {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < tc; i++) {
			char[] input = br.readLine().toLowerCase().toCharArray();
			ArrayList<Character> abc = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
			
			for(int a = 0; a < input.length; a++) {
				for(Character c : abc) {
					if(input[a] == c) {
						abc.remove(c);
						break;
					}
				}
			}
			if(abc.isEmpty()) {
				bw.write("pangram");
			} else {
				bw.write("missing ");
				for(Character p : abc) {
					bw.write(p + "");
				}
			}
			bw.write("\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
