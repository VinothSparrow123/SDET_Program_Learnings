package ProblemsSolved;

import org.junit.Test;

public class SingleNonDuplicateElement {
	
	/*
	 * Find the single non-duplicate element
	 */
	
	@Test
	public void data1() {
		int[] input= {2,2,4,4,5,5,7,7,8,11,11}; //9/2 - size 11 - 0 to 10
		System.out.println(nonDuplicateElement(input));
	}
	
	public void data2() {
		int[] input= {2,2,4,4,10,10,12,14,14};
		
	}
	
	public void data3() {
		int[] input= {};
		
	}
	
	/*Pseudo Code
	 * 
	 * 
	 * Declare Low=0;High=length-1;index;
	 * Itearate with while loop - while (low<=high)
	 * 		initialize mid=low+high/2
	 * 		check if mid is not equal to mid+1 and mid not equal to mid-1 -> return mid
	 * 		else if mid=mid+1 -> low=mid+2
	 * 		else mid=mid-1 -> high=mid-2
	 * 
	 */
	
	public int nonDuplicateElement(int[] input) {
		int low=0;int high=input.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			int currLeft=mid-low;int currRight=high-mid;
			if(input[mid] != input[mid+1] && input[mid] != input[mid-1]) 
				return input[mid];
			else if(input[mid] == input[mid+1] && (currLeft <currRight)) 
				high=mid+2;
			else low=mid-2;
		}
		
		return -1;
	}

}
