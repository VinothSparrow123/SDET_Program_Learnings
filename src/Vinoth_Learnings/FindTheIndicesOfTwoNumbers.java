package Vinoth_Learnings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindTheIndicesOfTwoNumbers {

	
	/*Find the indices of two numbers which equals the target.
	 * Given an array of Integers and Target
	 * 
	 */
	
	@Test
	public void data1() {
		int[] nums= {3,3,4,5,6,7,8,9};
		int target = 9;
		System.out.println("The two indices are - " + Arrays.toString(findIndices(nums, target)));
	}
	
	@Test
	public void data2() {
		int[] nums= {3,3,4,5,6,7,8,9};
		int target = 19;
		System.out.println("The two indices are - " + Arrays.toString(findIndices(nums, target)));
	}
	
	@Test
	public void data3() {
		int[] nums= {3,3,4,3,6,3,8,9};
		int target = 6;
		System.out.println("The two indices are - " + Arrays.toString(findIndices(nums, target)));
	}
	
	@Test
	public void data4() {
		int[] nums= {3,3,4,5,6,7,8,9};
		int target = 0;
		System.out.println("The two indices are - " + Arrays.toString(findIndices(nums, target)));
	}
	
	/*Pseudo Code
	 * 
	 * Declare variables j
	 * iterate using for loop - i, till the length-2
	 * Inside for loop use while loop with condition j<length
	 * inside the while loop add elements in i & j th position
	 * If sum equals to target return i & j
	 */
	
	public int[] findIndicesUsingForLoop(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++) {
			int j=i+1;
			while(j < nums.length-1) {
				if((nums[i] + nums[j]) == target) {
					return new int[]{i,j};
				}
				j++;
			}
		}
		
		return null;
	}
	
	public int[] findIndices(int[] nums, int target) {
		
		Map<Integer,Integer> map= new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[]{map.get(target-nums[i]), i};
			}else {
				map.put(nums[i], i);
			}
		}
		
		return null;
	}
}
