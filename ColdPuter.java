package kattis;

//import java.io.*;
import java.util.Scanner;

public class ColdPuter {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
//		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\"));
		
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			
			int g = scan.nextInt();
			
			if(g < 0) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
		scan.close();
		
	}
	
}
