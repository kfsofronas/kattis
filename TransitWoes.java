package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransitWoes {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");
		
		int leaveTime = Integer.parseInt(input[0]);
		int classTime = Integer.parseInt(input[1]);
		int n = Integer.parseInt(input[2]);
		
		String[] walkTime = br.readLine().split(" ");
//		int totalWalkTime = 0;
//		for(String p : walkTime) {
//			totalWalkTime += Integer.parseInt(p);
//		}
//		
		String[] busTime = br.readLine().split(" ");
//		int totalBusTime = 0;
//		for(String q : input) {
//			totalBusTime += Integer.parseInt(q);
//		}
//		
		String[] busInterval = br.readLine().split(" ");
		
		int totalTime = leaveTime;
//		bw.write("\nleave for class " + totalTime);
		for(int i = 0; i < n; i++) {
			//walk to bus
			totalTime += Integer.parseInt(walkTime[i]);
//			bw.write("\nwalk to bus " + totalTime);
			//wait for bus
//			bw.write("\n Integer.parseInt(busInterval[i]): " + Integer.parseInt(busInterval[i]) + "totalTime%Integer.parseInt(busInterval[i]): " + totalTime%Integer.parseInt(busInterval[i]) + " subtracted : " + (Integer.parseInt(busInterval[i]) - totalTime%Integer.parseInt(busInterval[i])));
			totalTime += (totalTime%Integer.parseInt(busInterval[i]) == 0) ? 0 : (Integer.parseInt(busInterval[i]) - totalTime%Integer.parseInt(busInterval[i]));
//			bw.write("\nwait for bus " + totalTime);
			//ride on bus
			totalTime += Integer.parseInt(busTime[i]);
//			bw.write("\nride on bus " + totalTime);
		}
		//walk to class
		totalTime += Integer.parseInt(walkTime[n]);
//		bw.write("\nwalk to class " + totalTime + "\n");
		
		
//		bw.write(Integer.toString(totalTime) + " < " + Integer.toString(classTime));
		bw.write((totalTime < classTime) ? "yes" : "no");
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
