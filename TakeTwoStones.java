package kattis;

import java.util.Scanner;

public class TakeTwoStones {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		if(scan.nextInt()%2 == 1) {
			System.out.println("Alice");
		} else {
			System.out.println("Bob");
		}
		scan.close();
	}
}
