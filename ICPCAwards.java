package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class ICPCAwards {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		String[] temp = new String[2];
		LinkedList<String[]> winningTeams = new LinkedList<String[]>();
		
		for(int i = 0; i < testCases; i++) {
			boolean universityWon = false;
			temp = br.readLine().split(" ");
//			System.out.println("DEBUG: temp[0] = " + temp[0]);
//			System.out.println("DEBUG: temp[1] = " + temp[1]);
			if(winningTeams.size() < 12) {
				for(int a = 0; a < winningTeams.size(); a++) {
					if(winningTeams.get(a)[0].equals(temp[0])) {
						universityWon = true;
						break;
					}
				}
				if(!universityWon) {
					winningTeams.add(temp);
				}
			}
		}
		br.close();
		
		for(int b = 0; b < 12; b++) {
			bw.write(winningTeams.get(b)[0] + " " + winningTeams.get(b)[1] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
}
