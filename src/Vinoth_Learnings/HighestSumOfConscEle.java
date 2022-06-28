package Vinoth_Learnings;

import java.util.Arrays;

import org.junit.Test;

public class HighestSumOfConscEle {
	
	/*
	 * Given an array of integers and a number k. Return the highest sum of any k
	 * consecutive elements in the array. Target 3
	 */

	@Test
	public void data1() {
		int[] nums = { 0, 8, 2, 3, 1 };
		int number = 3;
		System.out.println("The two indices are - " + Arrays.toString(highestSum(nums, number)));
	}

	@Test
	public void data2() {
		int[] nums = { 0, 1, 2, 3, 4 };
		int number = 14;
		System.out.println("The two indices are - " + Arrays.toString(highestSum(nums, number)));
	}

	@Test
	public void data3() {
		int[] nums = { 0, 0, 10, 3, -4 };
		int number = 1;
		System.out.println("The two indices are - " + Arrays.toString(highestSum(nums, number)));
	}

	public int[] highestSum(int[] nums, int number) {
		
		int sum= 0;
		for (int i = 0; i < number; i++) {
			sum =+ nums[i];
		}
		
		for (int j = number; j < nums.length-1; j++) {
			int currSum = sum + nums [j] - nums[j-number];
			if(currSum > sum) {
				number=j;
			}
		}
		
		return new int[] {nums[number-2],nums[number-1],nums[number]};
	}
	
	
}
