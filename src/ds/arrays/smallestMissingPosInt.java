package ds.arrays;

import org.junit.Test;

public class smallestMissingPosInt {
	
	@Test
	public void returnSmallMisInt_BruteForce() {
		int[] inputArray= {5,2,8,10,2,3,-1};
		findMissingInteger(inputArray);
//		int misInteger=findMissingInteger(inputArray);
//		System.out.println(inputArray[misInteger]);
	}
	
	/*
	 * @Test public void returnSmallMisInt() { int[] inputArray=
	 * {2,8,10,1,0,2,1,-3}; findMissingInteger(inputArray); // int
	 * misInteger=findMissingInteger(inputArray); //
	 * System.out.println(inputArray[misInteger]); }
	 */
	
	private void findMissingInteger(int[] inputArray) {
		int minInt=0;
		int i = 0;
		for (int j = i+1; j < inputArray.length; j++) {
			if((inputArray[j]<inputArray[i]) && inputArray[j]>0) {
				i=j;
				minInt=j;
			}
		}
		System.out.println("Minimum value in the array is "+inputArray[minInt]);
		
		for(int k=0;k<inputArray.length;k++) {
			inputArray[minInt]=inputArray[minInt]+1;
//			if(inputArray[minInt]!=inputArray[k]) {
//				System.out.println(inputArray[minInt] + " is the missing element");
//				break;
			}inputArray[minInt]++;
		}
}


//Approach 1
//Pseudo Code -- 2, 1 missing element
/*
 * 1. Find the minimum number in the Array
 * 2. Add one to the minimum number and store it in a variable - 
 * 3. Validate that updated minimum number is available in input array
 * 4. If yes, try to do steps 2 and 3 again
 * 5. If 3rd step return false, that is the smallest missing number
 */


//Approach2
//1. Sorting the given array
//2.   
//