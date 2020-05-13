package kattis;

import java.util.Scanner;

public class Tarifa {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int p = 0;
		for(int i = 0; i < n; i++) {
			p += scan.nextInt();
		}
		
		scan.close();
		
		System.out.println((x*(n+1)) - p);
		
	}

}
