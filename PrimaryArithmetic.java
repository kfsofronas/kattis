package kattis;

import java.util.Scanner;

public class PrimaryArithmetic {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		char[] aa, ba;
		int maxAdds;
		boolean carry = false;
		int count = 0;
		int count2 = 0;
		
		while(a != 0) {
			
			aa = Integer.toString(a).toCharArray();
			ba = Integer.toString(b).toCharArray();
			
			maxAdds = Math.min(aa.length, ba.length);
			
			for(int i = 1; i <= maxAdds; i++) {
				if(Math.addExact(Character.getNumericValue((aa[aa.length-i])), Character.getNumericValue((ba[ba.length-i]))) >= 10 || (carry && Math.addExact(Character.getNumericValue((aa[aa.length-i])), Character.getNumericValue((ba[ba.length-i]))) +  1 >= 10)) {
//					System.out.println("g " + Math.addExact(Character.getNumericValue((aa[aa.length-i])), Character.getNumericValue((ba[ba.length-i]))));
					count++;
					carry = true;
				} else {
					carry = false;
				}
			}
						
			if(aa.length > ba.length && carry) {
				
				try {
				
					while(carry && maxAdds + count2 <= aa.length) {
//						System.out.println("k " + Math.addExact(Character.getNumericValue(((aa[aa.length - maxAdds]))) , 1));
						if(Math.addExact(Character.getNumericValue((aa[aa.length - (maxAdds + count2)])), 1) >= 10) {
							count++;
							count2++;
						} else {
							carry = false;
						}
					}
				} catch (Exception e) {}
			} else if(ba.length > aa.length && carry) {
				
				try {
				
					while(carry && maxAdds + count2 <= ba.length) {
//						System.out.println("h " + Math.addExact(Character.getNumericValue(((ba[ba.length - maxAdds]))) , 1));
						if(Math.addExact(Character.getNumericValue((ba[ba.length - (maxAdds + count2)])), 1) >= 10) {
							count++;
							count2++;
						} else {
							carry = false;
						}
					}
				} catch (Exception e) {}
			}
			
			if(count == 0) {
				System.out.println("No carry operation.");
			} else if(count == 1) {
				System.out.println("1 carry operation.");
			} else if(count > 1) {
				System.out.println(count + " carry operations.");
			} else {
				System.out.println("Shit");
			}
			
			a = scan.nextInt();
			b = scan.nextInt();
			count = 0;
			count2 = 0;
			carry = false;
		} 
		
		scan.close();
		
	}
	
}
