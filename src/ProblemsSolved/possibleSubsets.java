//package ProblemsSolved;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class possibleSubsets {
//	/*
//	 * Given an integer array nums, return all possible subsets .
//		The solution set must not contain duplicate subsets.
//		 
//		Example 1:
//		Input: nums = [1,2,3]
//		Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//		Example 2:
//		Input: nums = [0]
//		Output: [[],[0]]
//	 */
//	
//	/*
//	 * create a recursion method: parameters -> nums,start=0,List<List<Integer>>, subset,result
//	 * 
//	 * while(start<nums.length && end<nums.length) //0
//	 * 		List<Integer> subset=new ArrayList<>();
//	 * 		results.add(new ArrayList<>(subset));
//	 * 		subset.add(nums[end]);
//	 * 		end++;
//	 * 		
//	 * start++;
//	 * 
//	 * 
//	 * 		
//	 * 
//	 */
//	
//	@Test
//	public void data1() {
//		int[] nums= {1,2,3};
//		getPossibleComb(nums);
//	}
//	
//	private List<List<Integer>> getPossibleComb(int[] nums) {
//		List<List<Integer>> c=new ArrayList<>();
//		
//		for(int k=0;k<nums.length;k++) {
////			combination(nums,k,possComb,0);
//		}
//		
//	}
//	
//	private void combination(int[] nums,int k,List<List<Integer>> combination,int start) {
//		
//		
////		for(int i=start)
//	}
//}
