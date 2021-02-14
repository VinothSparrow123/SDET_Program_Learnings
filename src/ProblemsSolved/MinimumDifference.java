package ProblemsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MinimumDifference {
	/*
	 * minimum difference: (Example: 2,4,6,10 Output: 2 4   4 6)
	 */
	
	@Test
	public void data1() {
		List<Integer> input= Arrays.asList(2,4,6,10);
		getMinDifference(input);
	}
	
	@Test
	public void data2() {
		List<Integer> input= Arrays.asList(5,9,-5,-9,10,2);
		getMinDifference(input);
	}
	
	@Test
	public void data3() {
		List<Integer> input= Arrays.asList(2,2,2,2,2);
		getMinDifference(input);
	}
	
	/*Pseudo Code
	 * 
	 * Sort the input
	 * Find the min diff between two numbers using for loop
	 * another for loop - if diff equal to min diff print 
	 * 
	 */

	private void getMinDifference(List<Integer> input) {
		Collections.sort(input);
		
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<input.size()-1;i++) {
			int currMin=Math.abs(input.get(i)-input.get(i+1));
			min = Math.min(min, currMin);
		}
		
		for(int i=0;i<input.size()-1;i++) {
			int currMin=Math.abs(input.get(i)-input.get(i+1));
			if(min==currMin) {
				System.out.println(input.get(i)+" "+input.get(i+1));
			}
		}
		
	}
}
