package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bela {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");
		
		int hands = Integer.parseInt(input[0]);
		char suit = input[1].charAt(0);
		int score = 0;
		char[] card;
		
		for(int i = 0; i < hands * 4; i++) {
			card = br.readLine().toCharArray();
			if(card[1] == suit) {
				switch(card[0]) {
					case '9':
						score += 14;
						break;
					case 'T':
						score += 10;
						break;
					case 'J':
						score += 20;
						break;
					case 'Q':
						score += 3;
						break;
					case 'K':
						score += 4;
						break;
					case 'A':
						score += 11;
						break;
				}
			} else {
				switch(card[0]) {
					case 'T':
						score += 10;
						break;
					case 'J':
						score += 2;
						break;
					case 'Q':
						score += 3;
						break;
					case 'K':
						score += 4;
						break;
					case 'A':
						score += 11;
						break;
				}
			}
		}
		
		bw.write(score + "");

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
