package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Datum {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		String[] input = br.readLine().split(" ");
		int day = Integer.parseInt(input[0]);
		int month = Integer.parseInt(input[1]);
		//dOTY = day of the year
		int dOTY = 0;
		
		switch(month) {
		//Jauary
		case 1:
			dOTY = day;
			break;
		//February
		case 2:
			dOTY = day + 31;
			break;
		//March
		case 3:
			dOTY = day + 59;
			break;
		//April
		case 4:
			dOTY = day + 90;
			break;
		//May
		case 5:
			dOTY = day + 120;
			break;
		//June
		case 6:
			dOTY = day + 150;
			break;
		//July
		case 7:
			dOTY = day + 181;
			break;
		//August
		case 8:
			dOTY = day + 212;
			break;
		//September
		case 9:
			dOTY = day + 243;
			break;
		//October
		case 10:
			dOTY = day + 273;
			break;
		//November
		case 11:
			dOTY = day + 304;
			break;
		//December
		case 12:
			dOTY = day + 334;
			break;
		}
		
		dOTY += 3;
		dOTY %= 7;
		
		switch(dOTY) {
		//Sunday
		case 0: 
			bw.write("Sunday");
			break;
		//Monday
		case 1: 
			bw.write("Monday");			
			break;
		//Tuesday
		case 2: 
			bw.write("Tuesday");
			break;
		//Wednesday
		case 3: 
			bw.write("Wednesday");
			break;
		//Thursday
		case 4: 
			bw.write("Thursday");
			break;
		//Friday
		case 5: 
			bw.write("Friday");
			break;
		//Saturday
		case 6: 
			bw.write("Saturday");
			break;	
		}

		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
