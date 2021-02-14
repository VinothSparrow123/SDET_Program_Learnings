package HomeWork;

import org.junit.Test;

public class LargestSumSubArray {

	/*Given an integer array nums, find the contiguous 
	 * subarray (containing at least one number) which has the largest sum and return its sum.
	 * 
	 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
		Output: 6
		Explanation: [4,-1,2,1] has the largest sum = 6.
	 */
	
	@Test
	public void data1() {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(findLargestSum(nums));
	}

	/* Pseudo Code - Sliding Window technique
	 * 
	 * Declare a variable as maxSum
	 * Have two pointer
	 * Iterate using while loop
	 * 		add the values of left and right indices and store it in a variable 'currSum'
	 * 		if currSum > maxSum -> maxSum=currSum
	 */
	
	private int findLargestSum(int[] nums) {
	
		if(nums.length < 2) 
			throw new IllegalArgumentException("Invalid input array");
		
		int maxSum=Integer.MIN_VALUE;
		int left=0;int right=left+1;
		
		int currSum=nums[left] + nums[right];
		
		for (int i = 0; i < nums.length; i++) {
			
		}
		
		return maxSum;
	}
	
	/* Pseudo Code - Brute Force
	 * 
	 * 
	 * 
	 */
	
	/* Pseudo Code - Divide and Conquer
	 * 
	 * 
	 * 
	 */
	
	//Another approach available in DummyDoc
	
}
