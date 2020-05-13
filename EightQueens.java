package kattis;

import java.util.Scanner;
//import java.io.*;

public class EightQueens {
	
	static char[][] board = new char[8][8];
	static int[][] queenPositions = new int[8][2];
	
	public static boolean check() {
		
		for(int k = 0; k < 7; k++) {
			for(int l = k + 1; l < 8; l++) {
				
//				System.out.println(" k = " + k + ", l = " + l);
				
				if(queenPositions[k][0] == queenPositions[l][0]) {
//					System.out.println("#1 " + queenPositions[k][0] + " " + queenPositions[l][0]);
					return false;
				} else if (queenPositions[k][1] == queenPositions[l][1]) {
//					System.out.println("#2" + queenPositions[k][1] + " " + queenPositions[l][1]);
					return false;
				} else if ((queenPositions[k][0] - queenPositions[k][1]) == (queenPositions[l][0] - queenPositions[l][1])) {
//					System.out.println("#3" + queenPositions[k][0] + " - "  + queenPositions[k][1] + ", " + queenPositions[l][0] + " - "  + queenPositions[l][1]);
					return false;
				} else if ((queenPositions[k][1] + queenPositions[k][0]) == (queenPositions[l][1] + queenPositions[l][0])) {
//					System.out.println("#4" + queenPositions[k][1] + " - "  + queenPositions[k][0] + ", " + queenPositions[l][1] + " - "  + queenPositions[l][0]);
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
//		Scanner scan = new Scanner(new FileInputStream("C:\\Users\\kfsof\\eclipse-workspace\\CSC 1052\\src\\kattis\\EightQueensInput.in"));
		
		for(int i = 0; i < 8; i++) {
			board[i] = scan.nextLine().toCharArray();
		}
		
		scan.close();
		
//		System.out.println("Board: ");
		
		for(int g = 0; g < 8; g++) {
			for(int h = 0; h < 8; h++) {
				
//				System.out.print(board[g][h]);
				
				if(board[g][h] == '*') {
					queenPositions[count][0] = g;
					queenPositions[count][1] = h;
					count++;
				}
			}
//			System.out.println();
		}
		
//		System.out.println("\nQueen Positions: ");
		for(int p = 0; p < 8; p++) {
//			System.out.println(queenPositions[p][0] + ", " + queenPositions[p][1]);
		}
		
		if(check()) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
		
	}
	
}
