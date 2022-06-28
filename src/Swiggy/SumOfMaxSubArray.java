package Swiggy;

import org.junit.Test;

public class SumOfMaxSubArray {
	@Test
	public void data1() {
		int[] array = {-2,1,-3,4,-1,2,1,-5,4};
		findMaxSumOSubArray(array);
	}

	private int findMaxSumOSubArray(int[] array) {
		// TODO Auto-generated method stub
		int sum=Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			int j=i+1;
			int currSum = array[i];
			while(j < array.length) {
				currSum += array[j];
				sum = Math.max(sum, currSum);
				j++;
			}
		}

		return sum;
	}
}
