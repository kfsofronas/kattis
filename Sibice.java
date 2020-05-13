package kattis;

import java.util.Scanner;

public class Sibice {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int length = scan.nextInt();
		int width = scan.nextInt();
		double maxL = Math.sqrt(length*length + width*width);
//		System.out.println(maxL);
		
		for(int i = 0; i < n; i++) {
			if(scan.nextInt() <= maxL) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
		
		scan.close();
		
	}
	
}
