package ProblemsSolved;

import org.junit.Test;

public class IndexOfPeakElement_BinarySearch {
	/*
	 * A peak element is an element that is strictly greater than its neighbors.

	Given an integer array nums, find a peak element, and return its index. 
	If the array contains multiple peaks, return the index to any of the peaks.

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should 
return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the 
peak element is 2, or index number 5 where the peak element is 6.
	 */

	@Test
	public void data1() {
		int[] nums= {1,2,3,1};
		System.out.println(getPeakElement(nums));
	}

	@Test
	public void data2() {
		int[] nums= {1,2,1,3,5,6,4};
		System.out.println(getPeakElement(nums));
	}

	@Test
	public void data3() {
		int[] nums= {1,2,1,6,6,6};
		System.out.println(getPeakElement(nums));
	}

	/*Pseudo Code
	 * 
	 * Declare low, High and Mid variable
	 * iterate thru whie loop
	 * 		if value of mid lesser or equal to mid+1 -> assign low to mid+1
	 * 		else if value of mid > mid+1 -> return value of mid
	 * 		
	 */

	private int getPeakElement(int[] nums) {
		int low=0;int high=nums.length-1;
		while(low < high) {
			int mid=(high+low)/2;
			if(nums[mid] > nums[mid+1]) 
				high=mid;
			else 
				low=mid+1;
		}

		return nums[low];
	}

}
