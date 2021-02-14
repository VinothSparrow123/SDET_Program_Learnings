package HomeWork;

import org.junit.Test;

public class duplicateSumEqualZero {
	
	/*
	 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
		The same repeated number may be chosen from C unlimited number of times.
		Example,
		Given candidate set 2,3,6,7,1 and target 7, -> -2, 7, 2
		A solution set is:
		[2, 2, 3]
		[3,3,7]
		[2,2,2,1]
		[7]
	 */
	
	@Test
	public void data1() {
		int[] candidate= {2,3,6,7,1};
		int target=7;
		getTheSum(candidate,target);
	}
	
	
	/*Pseudo Code
	 * 
	 * Step1: Construct a Recursive function
	 * Step2: Subtract the target with the first element 7-2 = 5, 
	 * Step3: check remaining (5) is available in the array
	 * 		3(a) Yes -> Add the current element and remaining in the list
	 * 		3(b) No  -> if(remaining - nextCurrentElement) > 0
	 * 					call the recursive function
	 * 				else 
	 * 					
	 * 
	 */
	
	//Solution is available in December05_Document
	private void getTheSum(int[] candidate,int target) {
		
//		comb
	}
	
	
}
