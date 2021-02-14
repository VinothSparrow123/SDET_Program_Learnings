package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class smallestMissingPosInt2_Sort {
	
	@Test
	public void returnSmallMisInt_BruteForce() {
		int[] inputArray= {5,2,8,10,2,3};
		findMissingInteger(inputArray);
	}
	
//	@Test
//	public void returnSmallMisInt() {
//		int[] inputArray= {5,2,8,10,2,3,-3,0};
//		findMissingInteger(inputArray);
//	}
	
	/*
	 * @Test public void returnSmallMisInt() { int[] inputArray=
	 * {2,8,10,1,0,2,1,-3}; findMissingInteger(inputArray); // int
	 * misInteger=findMissingInteger(inputArray); //
	 * System.out.println(inputArray[misInteger]); }
	 */
	
	private void findMissingInteger(int[] inputArray) {
		Arrays.sort(inputArray);
		
		for(int i=0;i<inputArray.length-1;i++) {
			int j=i+1;
			int leastPosInt=1;
			if(inputArray[i]>=0 && inputArray[j]-inputArray[i]>1 && inputArray[j]>0) {
				leastPosInt=inputArray[i]+1;
				System.out.println("Smallest missing positive integer in the given array is: "+leastPosInt);
				break;
			}
		}
		
	}
}


//Approach2
//1. Sort the given array
//2. Get the first element and add one to it   
//3. Verify that available in the next position and it's greater than zero
