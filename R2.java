package kattis;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int r = scan.nextInt();
		int s = scan.nextInt();
		
		System.out.println(s*2 - r);
		
		scan.close();
		
	}
	
}
