package kattis;

import java.util.Scanner;

public class TimeLoop {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + " Abracadabra");
		}
	}
	
}
