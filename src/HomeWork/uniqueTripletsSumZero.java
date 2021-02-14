package HomeWork;

import org.junit.Test;

public class uniqueTripletsSumZero {
	
	/*
	 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

		Note that the solution set must not contain duplicate triplets.
		
		Example 1:		
		Input: nums = [-1,0,1,2,-1,-4]
		Output: [[-1,-1,2],[-1,0,1]]
		
		Example 2:
		Input: nums = []
		Output: []
	 * 
	 */
	
	@Test
	public void data1(){
		int[] nums = {-1,0,1,2,-1,-4};
		findUniqueTriplets(nums);
	}
	
	/*Pseudo Code:
	 * Convert the nums to list
	 * Initialize tripletList list<Integer>
	 * create the local variables a, b, c
	 * 
	 * if sum of a,b,c is zero -> break the loop
	 * 
	 */
	
	
	public void findUniqueTriplets(int[] nums) {
		
		
	}

}
