package kattis;

import java.util.Scanner;

public class Zamka {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int l = scan.nextInt();
		int d = scan.nextInt();
		int x = scan.nextInt();
		int temp = 0;
		int temp2 = 0;
		
		scan.close();
		
		for(int i = l; i <= d; i++) {
			temp = i;
			temp2 = 0;
			while(temp > 0) {
				temp2 += temp % 10;
				temp /= 10;
			}
			
			if(temp2 == x) {
				System.out.println(i);
				break;
			}
		}
		
		
		temp = 0;
		temp2 = 0;
		
		for(int u = d; u >= l; u--) {
//			System.out.println("u = " + u);
			temp = u;
			temp2 = 0;
			while(temp > 0) {
				temp2 += temp % 10;
				temp /= 10;
			}
			
			if(temp2 == x) {
				System.out.println(u);
				break;
			}
		}
				
	}
	
}
