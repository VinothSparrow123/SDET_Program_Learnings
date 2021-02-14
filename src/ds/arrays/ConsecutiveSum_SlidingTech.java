package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class ConsecutiveSum_SlidingTech {
	
	@Test
	public void returnSmallMisInt_BruteForce() {
		int[] inputArray= {5,2,8,10,2,3};
		int consecutiveNum=3;
		consecutiveAddition(inputArray,consecutiveNum);
	}
	
	@Test
	public void data2() {
		int[] inputArray= {5,2,8,10,2,3};
		int consecutiveNum=3;
		consectiveAddWithSlid(inputArray,consecutiveNum);
	}
	
	
	//Approach1
	private void consecutiveAddition(int[] inputArray,int consecutiveNum) {
		int maxAdd=0;
		for(int i=0;i<inputArray.length-(consecutiveNum-1);i++) {
			int j=i;
			int updateMax=(inputArray[j]+inputArray[j+1]+inputArray[j+2]);
			if(updateMax>maxAdd) {
				maxAdd=updateMax;
			}
		}
		System.out.println(maxAdd);
	}
	
	//Approach2
	private void consectiveAddWithSlid(int[] inputArray,int consecutiveNum) {
		if(consecutiveNum>inputArray.length) 
			throw new IllegalArgumentException("Given consecutive number is an invalid");
		
		//loop the forst set of elements and store it in the maximum
		int max_sum=0;
		for(int i=0;i<consecutiveNum;i++) {
			max_sum += inputArray[i];
		}
		
		//assume max value is is my max
		int window_max=max_sum;
		
		//loop thro the rest
//		for(int i=consecutiveNum;)
		
		
	}
}


//Approach
//1. Get the inputArray
//2. 
//3. 
