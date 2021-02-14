package ProblemsSolved;

public class FindIndexUsingBinarySearch {
	
	/*You are given an integer array nums sorted in ascending order and an integer target.

		Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
		
		If target is found in the array return its index, otherwise, return -1.
		
		Example 1:
		
		Input: nums = [4,5,6,7,0,1,2], target = 0
		Output: 4
		Example 2:
		
		Input: nums = [4,5,6,7,0,1,2], target = 3
		Output: -1
		
		Example 3:
		
		Input: nums = [1], target = 0
		Output: -1
	 * 
	 */
	
	public void data1() {
		int[] nums= {4,5,6,7,0,1,2};
		int target=0;
		System.out.println(findIndexOfTarget(nums,target));
	}
	
	/*Pseudo Code
	 * 
	 * Declare Low, High variables
	 * Iterate with while loop
	 * 		initialize mid value as low+high/2
	 * 		if value of mid is equal to target return mid
	 * 		else if value of low is lesser than target & value of mid greater than target
	 * 			set high=mid-1;
	 * 		else low=mid+1;
	 * 		
	 */

	private int findIndexOfTarget(int[] nums, int target) {
		int low=0;int high=nums.length-1;
		while(low <= high) {
			int mid=(low+high)/2;
			if(nums[mid] == target) 
				return mid;
			else if(nums[low] <= target && nums[mid] > target)
				high=mid-1;
			else low=mid+1;
		}
		
		return -1;
	}

}
