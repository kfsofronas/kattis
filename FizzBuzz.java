package kattis;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int Fizz = scan.nextInt();
		int Buzz = scan.nextInt();
		int n = scan.nextInt();
		String output = "";
		
		scan.close();
		
		for(int i = 1; i <= n; i++) {
			if(i%Fizz == 0) {
				output += "Fizz";
			} 
			if(i%Buzz == 0) {
				output += "Buzz";
			}
			if(output.length() == 0) {
				output += i;
			}
			System.out.println(output);
			output = "";
		}
		
	}
	
} 
