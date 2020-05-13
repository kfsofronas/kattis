package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OddManOut {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= tc; i++) {
			String toReturn = "";
			int guests = Integer.parseInt(br.readLine());
			String[] SGuestList = br.readLine().split(" ");
			int[] guestList = new int[SGuestList.length];
			for(int a = 0; a < SGuestList.length; a++) {
				guestList[a] = Integer.parseInt(SGuestList[a]);
			}
			Arrays.sort(guestList);
			for(int b = 0; b < guests-1; b+=2) {
				if(guestList[b] != guestList[b+1]) {
					toReturn = "Case #" + i + ": " + guestList[b] + "\n";
					break;
				}
			}
			if(toReturn.equals("")) {
				toReturn = "Case #" + i + ": " + guestList[guests-1] + "\n";
			}
			bw.write(toReturn);
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
