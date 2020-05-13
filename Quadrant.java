package kattis;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean x = false, y = false;
		int xp, yp;
		
		xp = scan.nextInt();
		yp = scan.nextInt();
		
		if (xp > 0) {
			x = true;
		} 
		
		if (yp > 0) {
			y = true;
		}
//		System.out.println(x);
//		System.out.println(y);
		
		if(x && y) {
			System.out.println(1);
		} else if(!x && y) {
			System.out.println(2);
		} else if(!x && !y) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
		scan.close();
		
	}
	
}
