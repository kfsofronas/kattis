package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class LastFactorialDigit {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		int tc = Integer.parseInt(br.readLine());
		Integer[] nums = new Integer[tc];
		
		for(int i = 0; i < tc; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		Integer[] nums2 = nums.clone();
		Arrays.sort(nums);
		
		int digit = 1;
		int next = 1;
		int[] results = new int[tc];
		for(int j = 0; j < tc; j++) {
			while(next <= nums[j]) {
				digit = (digit * next) % 10;
				next++;
			}
			results[j] = digit;
		}
		
		List<Integer> list = Arrays.asList(nums);
		for(int k = 0; k < tc; k++) {
			bw.write(results[list.indexOf(nums2[k])] + "\n");
		}
		
//		bw.write(Arrays.toString(nums)+"\n"+Arrays.toString(nums2));
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
