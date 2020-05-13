package kattis;

import java.io.*;
import java.util.Scanner;

public class NeedForSpeed {
	
	public static void main(String[] args) throws Exception {
		
//		Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\NeedForSpeedInput.in"));
		
		double n = scan.nextInt();
		double t = scan.nextInt();
		
		double temp = 0;
		double d = 0;
		double s = 0;
		
		for(int i = 0; i < n; i++) {
			
			temp = scan.nextInt();
			d += temp;
			s += scan.nextInt() * temp;
			
		}
		
		System.out.println("(d/t) - (s/(n*d))");
		
		System.out.println("(" + d + "/" + t + ") - (" + s + "(" + n + "*" + d + "))" ); 
		
		System.out.println( (d/t) - (s/(n*d)) );
		
		scan.close();
		
	}
	
}
