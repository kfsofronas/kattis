package kattis;

//import java.io.*;
import java.util.Scanner;

public class Trik {
	
	public static void main(String[] args) throws Exception {
	
		Scanner scan = new Scanner(System.in);
//		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\TrikInput.in"));
		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		
		char[] input = scan.nextLine().toCharArray();
		
		scan.close();
		
		boolean temp = false;
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] == 'A') {
				temp = a;
				a = b;
				b = temp;				
			} else if (input[i] == 'B') {
				temp = b;
				b = c;
				c = temp;
			} else if (input[i] == 'C') {
				temp = a;
				a = c;
				c = temp;
			}
		}
		
		if (a) {
			System.out.println(1);
		} else if (b) {
			System.out.println(2);
		} else if (c) {
			System.out.println(3);
		} else {
			System.out.println("Shit");
		}
		
	
		
	}
	
}
