package ProblemsSolved;

import org.junit.Test;

public class findThegreatestSumOfnumbers {
	/*
	 * Find the greatest sum of numbers based on k value given
	 */
	
	@Test
	public void data1() {
		int[] input= {10,3,33,5,2,32,21,14,17,8,9};
		int k=3;
		System.out.println(getMaxSumOfNumbers(input,k));
	}
	
	@Test
	public void data2() {
		int[] input= {10,4,13};
		int k=2;
		System.out.println(getMaxSumOfNumbers(input,k));
	}
	
	@Test
	public void data3() {
		int[] input= {10,3,33,5,2,32,21,14,17,8,9}; //k greater than size of input
		int k=30;
		System.out.println(getMaxSumOfNumbers(input,k));
	}
	
	/*Pseudo COde
	 * 
	 * Using sliding window logic, add the first three element and get the sum
	 * Then add next element and remove the left
	 * 
	 * Using Math.max calculate the maximum of addition
	 * 
	 */
	
	public int getMaxSumOfNumbers(int[] input,int k) {
		
		if(input.length<k) 
			throw new IllegalArgumentException("Given input is an invalid");
		
		int maxCount=0;
		
		int left=0;int right=k;
		
		for(int i=0;i<k;i++) {
			maxCount=maxCount+input[i];
		}
		
		while(right<input.length) {
			int currMax=maxCount-input[left]+input[right];
			left++;right++;
			maxCount=Math.max(maxCount, currMax);
		}
		
		return maxCount;
	}
}

/*int currentMax =0, pointer =0;
        while(pointer< k) currentMax += input[pointer++];
        int maximum = currentMax;
        while(pointer < input.length) {
            currentMax -= input[pointer-k];
            currentMax += input[pointer++];
            maximum = Math.max(currentMax, maximum);
        }
        return maximum;
 */
