/*
 * I have to redo the math on this one...
 */

package kattis;

import java.util.Scanner;

public class IHNN {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		
		for(int a = 0; a < testCases; a++) {
			System.out.print((int)((8 * Math.pow(9, scan.nextInt() - 1)))%1000000007);
		}
		
		scan.close();
		
	}
}
