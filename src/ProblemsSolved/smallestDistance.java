package ProblemsSolved;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class smallestDistance {
	/*
	 * Given an input array and two unique numbers, find the smallest distance between those 2 numbers
   		Example:a
   
   		Input1: [5,6,8,9,1,4,1] Input2: 8,1 Output: 2
      a) If there are no occurances of the unique numbers, then throw exception
      b) If there are multiple matches, the least distance should be considered
	 */
	
	/*Brute Force
	 * 
	 * Using two for loops
	 * 	Outer loop should iterate the index(0) of inp2
	 * 	inner loop should iterate the index(0 to length) of inp1 
	 * 
	 */
	
	/*Pseudo COde - Sliding window approach
	 * 
	 * check first element of input2 (8) is available in input1
	 * Get that index by converting to list and set it as starting point
	 * using for loop iterate from i=starting point to input1 length
	 * 		if you find the second element get the index and store it as last index
	 * 		Math.min(startingindex, last index)
	 */
	
	@Test
	public void data1() {
		int[] inp1= {5,6,8,8,9,1,8,4,1};
		int[] inp2= {8,1};
		System.out.println(getSmallestDistance(inp1,inp2));
	}
	
	
	private int getSmallestDistance(int[] inp1,int[] inp2) {
		int minDistance=0;
		List<Integer> lis=new ArrayList<>();
		for(int i=0;i<inp1.length;i++) {
			lis.add(inp1[i]);
		}
		int startingPoint=lis.indexOf(inp2[0]);
		int lastindex=0;
		
		for(int j=startingPoint+1;j<inp1.length;j++) {
			if(inp1[j]==inp2[1]) {
				lastindex=j;
				minDistance=lastindex-startingPoint;
				break;
			}
		}

		return minDistance;
	}
	
	/*
	 * Two pointer, two for loops
	 */
	
	/*
	 * 
	 */
}
