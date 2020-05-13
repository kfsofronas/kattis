package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ReversedBinaryNumbers {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);

		int input = Integer.parseInt(br.readLine());
		
		String[] binaryInput = Integer.toBinaryString(input).split("");
		String binaryOutput = "";
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int a = 0; a < binaryInput.length; a++) {
			s.push(Integer.parseInt(binaryInput[a]));
		}
		for(int b = 0; b < binaryInput.length; b++) {
			binaryOutput += s.pop();
		}
		
		bw.write("" + Integer.parseInt(binaryOutput, 2));
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
