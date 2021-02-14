package ProblemsSolved;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class IndicesForTwoSum {
	
	/*
	 * Two Sum II
		int[] nums = {1,4,5,7,8,9,11};
		int k = 12
		[[0,6][1,4][2,3]]
		int[] nums = {1,4,5,7,7,9,11};
		int k = 11
		[[1,3]]
	 */
	
	@Test
	public void data1() {
		int[] nums= {1,4,5,7,8,9,11};
		int k = 12;
		System.out.println(getIndicesOfTwoSum(nums,k));
	}
	
	/*Pseudo Code
	 * 
	 * Using two pointer Hold the left and move the right - while loop (left<nums.length-1) 
	 * If nums[right]+nums[left]=12
	 * 		Yes -> add the right, left into the set
	 * 		No -> increase the left until the length
	 * 
	 * If right reaches the max length, increment the left and reset the right
	 * 
	 */

	private Set<Set<Integer>> getIndicesOfTwoSum(int[] nums, int k) {
		
		int left=0;int right=left+1;
		
		Set<Set<Integer>> output=new HashSet<>();
		while(left<nums.length-1) {
			if(nums[right]+nums[left] == k) {
				Set<Integer> current=new HashSet<>();
				current.add(right);
				current.add(left);
				output.add(current);
			}
			right++;
			if(right==nums.length) {
				left++;right=left+1;
			}
		}
		return output;		
	}
}
