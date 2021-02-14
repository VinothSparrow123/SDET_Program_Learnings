package HomeWork;

import java.util.Arrays;

import org.junit.Test;

public class maxSum_winSlid {
	
	/*
	 * Write a program to fetch the sub array of length k from a given array and the sub array must have 
	 * maximum sum of all combinations (without sorting the array)

		Input: [4,2,11,1,23,2,3,15,14] , k = 3
		Output: [11,1,23]
		
		Input: [4,2,1,-7,23,2,-3,15,14], k = 4
		Output: [2,-3,15,14]
		
		Algorithm: Sliding Window
	 * 
	 */
	
	/*
	 * initialize start=0;end=0;maxSum=0;
	 * iterate using for loop (int i=1;i<input.length-2;i++)
	 * 	Inside the loop, define sum=(i-1)+i+(i+1);
	 * Compare if Math.max(sum, maxSum)
	 */
	
	@Test
	public void data1() {
		int[] inp= {4,2,11,1,23,2,3,15,14};
		int k=3;
		int[] findMaxSum = findMaxSum(inp,k);
		System.out.println(Arrays.toString(findMaxSum));
	}
	
	private int[] findMaxSum(int[] inp,int k) {
		
		int currSum=0;
		//assigning the max sum value as first k integers sum -> this could handle the only negative scenarios
		for(int m=0;m<k;m++) {
			currSum+=inp[m];
		}
		
		int consMax=currSum;
		int start=0;int end=k-1;
		
		for(int i=k;i<inp.length;i++) {
			currSum=currSum+inp[i]-inp[i-k];
			if(currSum>consMax) {
				start=i-k+1;end=i;
				consMax=currSum;
			}	
		}
		int[] data=new int[k];
		
		System.out.println(consMax);
		System.out.println(start);
		System.out.println(end);
		
//		System.arraycopy(inp, start, data, end, k);
		
		return data;
	}

}
