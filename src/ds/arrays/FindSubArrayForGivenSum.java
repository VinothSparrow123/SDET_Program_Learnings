package ds.arrays;

import org.junit.Test;

public class FindSubArrayForGivenSum {
	@Test
	public void data1() {
		int[] inputArray= {5,2,8,10,2,3};
		int targetSum=10;
		findSubArrayForGivenTarget(inputArray,targetSum);
	}
	public void findSubArrayForGivenTarget(int[] inputArray,int targetSum) {
		int i=0;
		int max_sum=0;
		for(int j=i;j<inputArray.length;j++) {
			max_sum=inputArray[i]+inputArray[j]+max_sum;
			if(max_sum>=targetSum) {
				if(max_sum==targetSum) {
					System.out.println("Starting and ending Indices are "+i+","+j);
				}j++;
			}i++;
		}
	}
}
