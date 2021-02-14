package HomeWork;

import org.junit.Test;

public class TwoSumProblem {
	
	/*Two Sum Problem
	 * 
	 * Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
	 */
	
	@Test
	public void data1() {
		int[] nums= {2,7,11,15};
		int target=9;
		getTwoSum(nums,target);
//		getTwoSum_BF(nums,target);
		
	}
	
	@Test
	public void data2() {
		int[] nums= {3,2,4};
		int target=6;
		getTwoSum(nums,target);
//		getTwoSum_BF(nums,target);
	}
	
	@Test
	public void data3() {
		int[] nums= {};
		int target=6;
		getTwoSum(nums,target);
//		getTwoSum_BF(nums,target);
	}
	
	
	private void getTwoSum(int[] nums,int target) {
		int left=0;int right=left+1;
		if (nums.length <2) {
			System.out.println("Invalid input array");
		}
		
		while(left < nums.length) {
			if(nums[left] + nums[right] == target) {
				System.out.println("The two indices are "+ left +" "+ right);
				break;
			}
			right++;
			
			if(right == nums.length) {
				right=left+1;left++;
			}
		}
	}
	
	//Brute Force using two for loops
	private void getTwoSum_BF(int[] nums, int target) {
		if (nums.length <2) {
			System.out.println("Invalid input array");
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println("The two indices are "+ i + " " + j);
				}
			}
		}
	}
	
	//Another approach available in DummyDoc

}
