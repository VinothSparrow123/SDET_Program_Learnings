package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class ProductsOfOtherElementsInArray {
	
	@Test
	public void data1() {
		int[] input= {0,1,2};
		System.out.println(Arrays.toString(getProductOfElementsInOtherIndices(input)));
	}
	
	/* Pseudo Code - Brute Force
	 * 
	 * declare variable: product
	 * 
	 * Using two for loops
	 * Outer Loop with i - from 0 to len-1
	 * 	Inner Loop 1 with j- i+1 to len-1
	 * 		get the product of each element
	 *  Inner Loop 2 with k- i to 0 (decremental)
	 *  	get the product and add it with the previous prod element
	 *  
	 *  Assign the input[i] = product value
	 */
	
	public int[] getProductOfElementsInOtherIndices(int[] input) {
		
		int[] output=new int[input.length];
		
		int prodValue=1;
		
		for (int i = 0; i < output.length; i++) {
			for (int j = i+1; j < output.length; j++) {
				prodValue=prodValue * input[j];
			}
			for (int k = 0; k <i ; k++) {
				prodValue=prodValue*input[k];
			}
			output[i]=prodValue;
		}
		
		return output;
	}
	
	/* Pseudo Code - Optimal Approach
	 * 
	 * Using individual for loop for left and right
	 * 
	 * Incremental for loop 
	 * Left - Multiply the first element with 1 for 1st index
	 * 		 Multiply the secind element with previous ele for 2nd index	
	 * 
	 * Decremental for loop
	 * Right - Multiply the last element with 1 for last index
	 * 		 Multiply the last element with curr ele for curr index
	 * 
	 * In another loop
	 * multiply the index of right and left array to derive the output array
	 * 
	 */
	
	public int[] getProductOfElementsInOtherIndicesOptimal(int[] input) {
		int[] output=new int[input.length];
		int[] left=new int[input.length];
		int[] right=new int[input.length];
		
		for (int i = 0; i < input.length; i++) {
//			input[i] == input[i]
			
		}
		
		return output;
	}

}
