package ProblemsSolved;

import org.junit.Test;

public class absoluteDiff {
	/*
	 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
		Example 1:
		Input: nums = [1,2,3,1], k = 3
		Output: true
		Example 2:
		Input: nums = [1,0,1,1], k = 1
		Output: true
		Example 3:
		Input: nums = [1,2,3,1,2,3], k = 2
		Output: false
		Example 4:
		Input: nums = [1,2,3,2,2,3], k = 2
		Output: true
		Hint: Window Sliding
	 */
	
	/*Pseudo Code
	 * 
	 * initialize start=0 variable
	 * Iterate using while loop with condition (end<nums.length);
	 * if(num[start]=nums[end])
	 * 	Yes -> get the indices and find the difference and check if it is lesser or equal than k
	 * 			Yes-> return true
	 * 			No -> start++;end=start+1;
	 * 	No -> start++;end=start+1; for next iteration
	 */
	
	/*Pseudo Code
	 * 
	 * initialize start=0 variable
	 * Get the first k integers, and iterate using for loop to compare the start value with 
	 * 	rest of the values
	 * 
	 */
	
	@Test
	public void data1() {
		int[] input= {1,2,3,1};
		int k=3;
		System.out.println(getAbsoluteDiff(input,k));
	}
	
	private boolean getAbsoluteDiff(int[] input,int k) {
		int start=0;int end=1;
		
		return false;
	}

}
