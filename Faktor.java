package kattis;

import java.util.Scanner;

public class Faktor {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		scan.close();
		
		System.out.println((int)(Math.floor(a*(b-1)) + 1));
		
	}
	
}
