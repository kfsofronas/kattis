package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class IveBeenEverywhereMan {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < testCases; i++) {
			int trips = Integer.parseInt(br.readLine());
			ArrayList<String> cities = new ArrayList<String>();
			cities.add("");
			int count = 0;
			for(int a = 0; a < trips; a++) {
				String currCity = br.readLine();
				boolean visited = false;
				for(String c : cities) {
					if(currCity.equals(c)) {
						visited = true;
						break;
					}
				}
				if(!visited) {
					cities.add(currCity);
					count++;
				}
			}
			bw.write(count + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
