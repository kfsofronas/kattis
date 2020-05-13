package kattis;

import java.util.Scanner;

public class BatterIUp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		double count = 0;
		double numerator = 0;
		int a = 0;
		
		for(int i = 0; i < n; i++) {
			a = scan.nextInt();
			if(a >= 0) {
				numerator += a;
				count++;
			}
		}
		
		scan.close();
		
		System.out.println(numerator/count);
		
	}
	
}
