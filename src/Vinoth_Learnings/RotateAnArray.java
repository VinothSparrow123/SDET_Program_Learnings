package Vinoth_Learnings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.math.*;

import org.junit.Test;

public class RotateAnArray {

	/*
	 * Rotate an array by given number of times
	 * 
	 * 
	 * 123456 -> 612345 -> 561234
	 * 
	 * 4 -> 345612
	 * 
	 * 
	 * Pseudo Code: Initialize a new array Fill the array using for loop from index
	 * - rotation times, to the end
	 * 
	 */

	@Test
	public void data1() {
		int[] nums = { 0, 8, 2, 3, 1 };
		int number = 3;
		System.out.println("The two indices are - " + Arrays.toString(rotateAnArray(nums, number)));
	}

	@Test
	public void data2() {
		int[] nums = { 0, 1, 2, 3, 4 };
		int number = 14;
		System.out.println("The two indices are - " + Arrays.toString(rotateAnArray(nums, number)));
	}

	@Test
	public void data3() {
		int[] nums = { 0, 0, 10, 3, -4 };
		int number = 1;
		System.out.println("The two indices are - " + Arrays.toString(rotateAnArray(nums, number)));
	}

	@Test
	public void data4() {
		int[] nums = { 3, 3, 4, 5, 6, 7, 8, 9 };
		int target = 0;
		System.out.println("The two indices are - " + Arrays.toString(rotateAnArray(nums, target)));
	}

	/*
	 * Pseudo Code
	 * 
	 * 
	 */

	public int[] rotateAnArray(int[] nums, int k) {

		if (k > nums.length)
			k = k % nums.length;

		int[] rotatedArray = new int[nums.length];
		
		int n=nums.length - k;
		
		int i = 0;
		
		for (int j = n; j < nums.length; j++) {
			rotatedArray[i++] = nums[j];
		}
		for (int m = 0; m < n; m++) {
			rotatedArray[i++] = nums[m];
		}

		return rotatedArray;
	}
}
