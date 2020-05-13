package kattis;

/*
 * Currently this program is too slow to pass the second test case
 */

//import java.io.*;
//import java.util.ArrayList;
import java.util.Scanner;


public class CD {

	public static boolean contains(int[] catalog, int disc) {
		
		int currentIndex = (catalog.length-1)/2;
		int current = catalog[currentIndex];
		
		if(disc > catalog[catalog.length-1] || disc < catalog[0]) {
			return false;
		} 
		
		if(disc == catalog[0] || disc == catalog[catalog.length-1]) {
			return true;
		}
		
		/*for(int i = 0; i < catalog.length; i++) {
			if(catalog[i] == disc) {
				
				return true;
				
			}
		}*/
		while(current != catalog[0] || current != catalog[catalog.length-1]) {
			
			current = catalog[currentIndex];
			
			if(disc == current) {
				return true;
			} else if(disc < current) {
				currentIndex /= 2;
			} else /*if(disc > current)*/ {
				currentIndex += currentIndex/2;
			}
			
		}
		
		
		return false;
		
	}
	
	public static void check(int[] n) throws Exception {
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		//Scanner scan = new Scanner(System.in);
		
		//ArrayList<Integer> seen = new ArrayList<Integer>();
		
		//Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\CDInput.in"));
		
		//gets the size of each person's cd collection by number of cds
		int jackL = n[0];
		int jillL = n[1];
		//System.out.println(jackL);
		//System.out.println(jillL);		
		
		//represents each person's cd collection
		int[] jack = new int[jackL];
		int[] jill = new int[jillL];
		
		//adds cds to each jack's collection
		for(int i = 2; i < jackL; i++) {
			
			jack[count1] = n[i];
			count1++;
			//System.out.println(jack[i]);
		}
		
		//adds cds to jill's collection
		for(int b = jackL + 1; b < jillL; b++) {
			
			jill[count2] = n[b];
			count2++;
			//System.out.println(jill[b]);
		}
				
		for(int c = 0; c < jackL; c++) {
			
			//if(seen.contains(Integer.valueOf(jack[c]))) {} else			
			if(contains(jill, jack[c])) {
				count++;
			//	seen.add(jack[c]);
			}
			
		}
		
		//System.out.println("This is jack[]: " + jack.length );
		
		//System.out.println("This is jill[]: " + jill.length );
		
		System.out.println(count);

	}
	
	public static void main(String args[]) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		//Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\CDInput.in"));
		
		int a = scan.nextInt();
		
		do {
		
		int b = scan.nextInt();
		
		int[] n = new int[a + b + 2];
		
		n[0] = a;
		n[1] = b;
		
		for(int i = 2; i < n.length; i++) {
			
			n[i] = scan.nextInt();
			
		}
		
		
		/*System.out.println("n[]: \n\n");
		for(int u = 0; u < n.length; u++) {
			System.out.println(n[u]);
		}*/
		
		a = scan.nextInt();
		
			check(n);
			//System.out.println("a = " + a);
		} while (a != 0);
		
		scan.close();
		
	}
	
}
