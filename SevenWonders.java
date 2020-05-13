package kattis;

import java.util.Scanner;

public class SevenWonders {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[] s = scan.nextLine().toCharArray();
		scan.close();

		int t = 0;
		int c = 0;
		int g = 0;
				
		for(int i = 0; i < s.length; i++) {
			if(s[i] == 'T') {
				t++;
			} else if (s[i] == 'C') {
				c++;
			} else if (s[i] == 'G') {
				g++;
			}
		}
		
		System.out.println((Math.min(Math.min(t, c), g) * 7) + (t*t) + (c*c) + (g*g));	
	
	}
	
}
