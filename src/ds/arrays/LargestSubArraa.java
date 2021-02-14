package ds.arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LargestSubArraa {
	/*In array A is larger than some array B if for the first index i where A[i] != B[i], A[i] > B[i].
For example, consider 0-indexing:
[1,3,2,4] > [1,2,2,4], since at index 1, 3 > 2.
[1,4,4,4] < [2,1,1,1], since at index 0, 1 < 2.
A subarray is a contiguous subsequence of the array.
Given an integer array nums of distinct integers, return the largest subarray of nums of length k.
	 * 
	 */
	
	@Test
	public void data1(){
		int[] nums = {7,4,5,2,3};
		int k = 3;
		System.out.println(largestSubArray(nums,k));
	}
	
	@Test
	public void data2(){
		int[] nums = {1,4,5,2,3};
		int k = 4;
		System.out.println(largestSubArray(nums,k));
	}
	
	@Test
	public void data3(){
		int[] nums = {1,5};
		int k = 3;
		System.out.println(largestSubArray(nums,k));
	}

	private String largestSubArray(int[] nums, int k) {
		if(nums.length < k) throw new RuntimeException("K value is higher than input array length");
		
		List<Integer> max=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			max.add(nums[i]);
			temp.add(nums[i]);
		}
		
		for(int j=k;j<nums.length;j++) {
			temp.remove(0);
			temp.add(nums[j]);
			int i=0;
			while(i<k) {
				if(temp.get(i) < max.get(i)) {
					break;
				}else if(temp.get(i) == max.get(i)) {
					continue;
				}else if(temp.get(i)>max.get(i)) {
					max.clear();
					max.addAll(temp);
					break;
				}i++;
				if(i==k-1) i=0;
			}
		}
		return max.toString();
	}
	
}
