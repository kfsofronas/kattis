package kattis;

//import java.io.*;
import java.util.Scanner;

public class Filip {
	
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
//		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\"));
		
		char[] a = scan.next().toCharArray();
		char[] b = scan.next().toCharArray();
		
		scan.close();
				
		int aa = Integer.parseInt(a[2] + "" + a[1] + "" + a[0]);
		int bb = Integer.parseInt(b[2] + "" + b[1] + "" + b[0]);
		
		if(aa > bb) {
			System.out.println(aa);
		} else {
			System.out.println(bb);
		}
				
	}
	
}
