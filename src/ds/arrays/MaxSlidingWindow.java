package ds.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MaxSlidingWindow {
	
	//Problem1: 15:53 to 16:15
	
	@Test
	public void data1(){
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		System.out.println(getSlidingWindow(nums,k));
	}
	
	@Test
	public void data2(){
		int[] nums = {1,1,1};
		int k = 3;
		System.out.println(getSlidingWindow(nums,k));
	}
	
	@Test
	public void data3(){
		int[] nums = {1,1};
		int k = 3;
		System.out.println(getSlidingWindow(nums,k));
	}
	
	private List<Integer> getSlidingWindow(int[] nums,int k){
		
		if(nums.length < k) throw new RuntimeException("K value is higher than input array length");
		
		int max=Integer.MIN_VALUE;
		
		List<Integer> output=new ArrayList<>();
		List<Integer> temp=new ArrayList<>();
		
		for(int i=0;i<k;i++) {
			temp.add(nums[i]);
			max=Math.max(max, nums[i]);
		}
		output.add(max);
		for(int j=k;j<nums.length;j++) {
//			output.add(max);
//			temp.remove(0);
			max=Math.max(max, nums[j]);
//			temp.add(nums[j]);
//			max=Collections.max(temp);
			output.add(max);
		}
		
		return output;
	}
	//Time - O[N]
	//Space - O[N]
}
