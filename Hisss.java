package kattis;

//import java.io.*;
import java.util.Scanner;

public class Hisss {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
//		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\"));
		
		char[] s = scan.next().toCharArray();
		
		scan.close();
		
		boolean hiss = false;
		
		for(int i = 0; i < s.length-1; i++) {
			if(s[i] == 's' && s[i+1] == 's') {
				hiss = true;
			}
		}
		
		if(hiss) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}
	}
	
}
