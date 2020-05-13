package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;


/*Method 1
 *	Start at N and find every divisor of N
 *	Recursively find the divisors of every non-prime divisor of N
 *	add 1 to a count variable each recursion and take the largest count and output it.
 *	Order n^2 i think
 *
 *	do this for N, but then check for every a where a < N and a > the first non-prime factor in the longest string of N
 */
public class DividingSequence {
	
	public int length = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");
		
		//n = N
		int number = Integer.parseInt(input[0]);
		
		ArrayList<Integer> al = recur(number);
		
//		System.out.println("super duper final longest is " + recur(number) + "\n\n");
		
		//bw.write("al is " + al.toString());
		
		/*
		 * now i have to figure out how to check all a < n where a > largest factor of n in longest list
		 */
		
		if(al.get(1) != number-1) {
			boolean isDone = false;
			int largestFactor = al.get(1);
			int a = number-1;
			ArrayList<Integer> oldTempAL = al;
			ArrayList<Integer> newTempAL;
			
//			System.out.println("number = " + number);
//			System.out.println("a = " + a);
//			System.out.println("largestFactor = " + largestFactor);
			
			//order whatever you want bro
			while(!isDone) {
				if(a <= largestFactor) {
//					System.out.println("a (" + a + ") <= largestFactor (" + largestFactor + ")");
					isDone = true;
				} else {
					newTempAL = recur(a);
					
//					System.out.println("newTempAL is currently = " + newTempAL);
					
					if(newTempAL.size() > al.size()) {
						al = newTempAL;
					}
					if(newTempAL.get(1) > largestFactor) {
						largestFactor = newTempAL.get(1);
					}
					oldTempAL = newTempAL;
					a--;
				}
			}
		
			//System.out.println("al.get(al.size()-2) = " + al.get(al.size()-2));
//			System.out.println("oldTempAL = " + oldTempAL);
//			System.out.println("newTempAL = " + newTempAL);
		
		}
		
//		String s = "";
//		for(int i = 0; i < al.size(); i++) {
//			s += al.get(i) + " ";
//			//System.out.print("s is currently " + s);
//		}
//		s = s.substring(0, s.length()-1);
//		
//		System.out.println("al = " + al);
		
		//puts al in the order we want
		Collections.reverse(al);
		
		//puts al into a string s in the way that we want the output to look
		String s = "";
		for(int i = 0; i < al.size(); i++) {	
			s += al.get(i) + " ";
			//System.out.print("s is currently " + s);
		}
		s = s.substring(0, s.length()-1);
		
//		System.out.println("al = " + al);
		
		bw.write(al.size() + "\n");
		
		//prints s
		bw.write(s);
		
//		bw.write(al.toString());

		bw.flush();
		bw.close();
		br.close();
		
	}
	
	//order idk bro but its not good
	public static ArrayList<Integer> recur(int n) {
		
		ArrayList<Integer> factorList = integerFactorization(n);
		ArrayList<Integer> longest = new ArrayList<Integer>(1);
		
//		System.out.println("\n-------recur for int n = " + n + "---------");
		
		//for each factor of n (not including n or 1) 
		for(int i = factorList.size()-2; i >= 1; i--) {
			ArrayList<Integer> newLongest = new ArrayList<Integer>();
			int temp = factorList.get(i).intValue();
//			System.out.println("temp is currently " + temp);
			//if its not prime and not 1, run the method again and add temp to the string
			if(temp != 1) {
				newLongest.addAll(recur(temp));
//				recur(temp);
			}
			
//			System.out.println("newLongest = " + newLongest);
			
			//if this is the longest arrayList, replace longest with this ArrayList.
			if (newLongest.size() > longest.size()) {
//				System.out.println("newLongest.size() = " + newLongest.size() + " and longest.size() = " + longest.size());
//				System.out.println("  inside if statement longest = " + longest);
				longest = newLongest;
//				System.out.println("     THIS is the new longest " + newLongest);
			}
		}
		
//		System.out.println("final longest is " + longest);
		
		if(!longest.contains(1)) {
			longest.add(1);
		}
		
		longest.add(0, n);
		
//		System.out.println("longest = " + longest + "\n");
		
//		System.out.println("------end recur for n = " + n + "------\n");
		
		return longest;
	}
	
	//order sqrt(n)
	public static ArrayList<Integer> integerFactorization(int n) 
    { 
		ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i) {
                    factors.add(i); 
                }
       
                else {
                	factors.add(i);
                	factors.add(n/i); 
                }
            } 
        } 
        Collections.sort(factors);
//        System.out.println("Factors is currently " + factors);
        return factors;
    } 
	
	//order sqrt(n)
	public static boolean isPrime(int n) {  
	   if (n <= 1) {  
	       return false;  
	   }  
	   for (int i = 2; i < Math.sqrt(n); i++) {  
	       if (n % i == 0) {  
	           return false;  
	       }  
	   }  
	   return true;  
	}
	
}
