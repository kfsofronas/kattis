package kattis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/* GIVEN:
 * x(t) = v*t*cos(angle)
 * y(t) = v*t*sin(angle) - 0.5*9.81*(t^2)
 * is y at x within the bounds of [lower + 1, upper - 1]?
 */


public class HumanCannonball {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out), "ASCII"), 512);
		
		int testCases = Integer.parseInt(br.readLine());
		//v = velocity
		//angle = angle of cannon
		//x = distance from wall
		//lower = lower edge of hole in wall + 1m of safety margin
		//upper = upper edge of hole in wall - 1m of safety margin
		//t = time
		//y2 = the y of the cannonball at given x
		float v, angle, x, lower, upper, t, y2;
		
		for(int i = 0; i < testCases; i++) {
		
			String[] input = br.readLine().split(" ");
			v = Float.parseFloat(input[0]);
			angle = (float) Math.toRadians(Float.parseFloat(input[1]));
			x = Float.parseFloat(input[2]);
			lower = Float.parseFloat(input[3]) + 1;
			upper = Float.parseFloat(input[4]) - 1;
			
			//x = v*t*cos(angle) ==> t = x/(v*cos(angle))
			t = (float) (x/(v*Math.cos(angle)));
			
			//y(t) = v*t*sin(angle) - 0.5*9.81*(t^2)
			y2 = (float) (v*t*Math.sin(angle) - 0.5*9.81*(t*t));
			
			if(y2 > lower && y2 < upper) {
				bw.write("Safe\n");
			} else {
				bw.write("Not Safe\n");
			}
			
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
