package kattis;

import java.util.Scanner;

public class Autori {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char[] s = scan.nextLine().toCharArray();
		
		scan.close();
		
		for(int i = 0; i < s.length; i++) {
			
			if(Character.isUpperCase(s[i])) {
				System.out.print(s[i]);
			}
			
		}
		
	}
	
}
