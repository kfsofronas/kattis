package kattis;

//import java.io.*;
import java.util.Scanner;

public class Pot {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
//		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\"));
		
		int n = scan.nextInt();
		
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			
			int temp = scan.nextInt();
			int e = Character.getNumericValue(Integer.toString(temp).toCharArray()[Integer.toString(temp).toCharArray().length-1]);
			
			total += Math.pow(Integer.valueOf(Integer.toString(temp).substring(0, Integer.toString(temp).length() -1 )), e);
			
		}
		
		System.out.println(total);
		
		scan.close();
		
	}
	
}
