package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PieceOfCake2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		String[] input = br.readLine().split(" ");

		/*lame, readable solution
		int n = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		int y = Integer.parseInt(input[2]);
		
		if(x >= n-x) { 
			if(y >= n-y) { bw.write(Integer.toString(4*x*y)); }
			else { bw.write(Integer.toString(4*x*(n-y))); }
		} else {
			if(y >= n-y) { bw.write(Integer.toString(4*(n-x)*y)); }
			else { bw.write(Integer.toString(4*(n-x)*(n-y))); }
		}
		*/
		
		//epic, one-line solution
		bw.write(Integer.parseInt(input[1]) >= Integer.parseInt(input[0])-Integer.parseInt(input[1]) ? (((Integer.parseInt(input[2]) >= Integer.parseInt(input[0])-Integer.parseInt(input[2]))) ? (Integer.toString(4*Integer.parseInt(input[1])*Integer.parseInt(input[2]))) : (Integer.toString(4*Integer.parseInt(input[1])*(Integer.parseInt(input[0])-Integer.parseInt(input[2]))))) : ((Integer.parseInt(input[2]) >= Integer.parseInt(input[0])-Integer.parseInt(input[2]))) ? (Integer.toString(4*(Integer.parseInt(input[0])-Integer.parseInt(input[1]))*(Integer.parseInt(input[2])))) : (Integer.toString(4*(Integer.parseInt(input[0])-Integer.parseInt(input[1]))*(Integer.parseInt(input[0])-Integer.parseInt(input[2])))));
		
		/* loose explanation of one-line solution
		//if 1 > n-1
		Integer.parseInt(input[1]) >= Integer.parseInt(input[0])-Integer.parseInt(input[1]) ? 
				//if 2 > n-2
				(((Integer.parseInt(input[2]) >= Integer.parseInt(input[0])-Integer.parseInt(input[2]))) ? 
						//then 1 and 2
						(Integer.toString(4*Integer.parseInt(input[1])*Integer.parseInt(input[2]))) 
						//else 1 and n-2
						: (Integer.toString(4*Integer.parseInt(input[1])*(Integer.parseInt(input[0])-Integer.parseInt(input[2]))))) 
		//else
				: 
				//if 2 > n-2
				((Integer.parseInt(input[2]) >= Integer.parseInt(input[0])-Integer.parseInt(input[2]))) ? 
						//then n-1 and 2
						(Integer.toString(4*(Integer.parseInt(input[0])-Integer.parseInt(input[1]))*(Integer.parseInt(input[2])))) 
						//else n-1 and n-2
						: (Integer.toString(4*(Integer.parseInt(input[0])-Integer.parseInt(input[1]))*(Integer.parseInt(input[0])-Integer.parseInt(input[2])))));
		*/
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
