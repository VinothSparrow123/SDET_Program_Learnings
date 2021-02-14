package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class MinimumSumOfContinuousArray {
	
	/*
	 * Amazon
		 Given an integer array, find the contiguous sub array of length k, with the minimum sum !!
		Return Sub array
		Return empty array when you k > array.length
		Return the first minimum sub array when multiple matches
	 */
	
	@Test
	public void data1() {
		int[] input= {1,2,4,5,2,4,7,0,1};
		int k=3;
		System.out.println(Arrays.toString(minSumArray(input,k)));
		System.out.println(Arrays.toString(minSumArray_WS(input,k)));
	}
	
	@Test
	public void data2() {
		int[] input= {1,2,4,5,2,4,7,0,1,4,2};
		int k=3;
		System.out.println(Arrays.toString(minSumArray(input,k)));
		System.out.println(Arrays.toString(minSumArray_WS(input,k)));
	}
	
	/*Pseudo Code - Brute Force
	 * 
	 * Declare variable: MinSum-Ineteger.Max
	 * 
	 * Two For Loops:
	 * 		Outer for loop - 0 to len-k
	 * 		Inner for loop - i to i+k
	 * 		int currMin = sum of inner for loop (i to k)
	 * 		if(currMin < MinSum) -> Start = i-k, End=i
	 * 		
	 * Return the subArray by using copyOfRange using indexes
	 * 
	 * Time - O(N2)
	 * Space - O(1)
	 */
	
	public int[] minSumArray(int[] input,int k) {
		
		if(k > input.length) return new int[] {};
		
		int minSum=Integer.MAX_VALUE;
		int start=0;int end=0;
		
		for (int i = 0; i <= input.length-k; i++) {
			int currMin=0;
			for (int j = i; j < i+k; j++) {
				currMin=currMin+input[j];
			}
			if(minSum>currMin) {
				minSum=currMin;
				start=i;end=i+k-1;
			}
			
		}
		return Arrays.copyOfRange(input, start, end+1);
	}
	
	/*Pseudo Code - Window Sliding
	 * 
	 * Declare variable: MinSum, Start, end
	 * 
	 * calculate MinSum value iterating from 0 to k
	 * 
	 * 
	 * another for loop - from k to len-1
	 * 		
	 * 		if min > currSum
	 * 			get the start and end
	 * 			
	 */
	
	public int[] minSumArray_WS(int[] input,int k) {
		if(k > input.length) return new int[] {};
		
		int minSum=0;
		
		for (int i = 0; i < k; i++) {
			minSum=minSum+input[i];
		}
		int winSum=minSum;
		int start=0;int end=k-1;
		
		for (int i = k; i < input.length; i++) {
			winSum=winSum+input[i]-input[i-k];
			if(winSum <minSum) {
				minSum=winSum;
				start=i-k+1;end=i;
			}
		}
		return Arrays.copyOfRange(input, start, end+1);
	}
	
	/* Pseudo Code - 
	 * 
	 */
}
