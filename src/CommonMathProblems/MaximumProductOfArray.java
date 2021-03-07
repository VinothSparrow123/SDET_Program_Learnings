package CommonMathProblems;

import java.util.Arrays;

import org.junit.Test;

public class MaximumProductOfArray {
	
	@Test
	public void data1() {
		int[] input= {2,3,4,5,0,1};
		System.out.println(getMaximumProductOfSubArray(input));
	}

	private int getMaximumProductOfSubArray(int[] input) {
		
		int sum=0;
		int start=0;int end=0;
		
		for (int i = 0; i < input.length-1; i++) {
			int currSum=1;
			for (int j = i; j < input.length; j++) {
				currSum=currSum*input[j];
				if(currSum>sum) {
					sum=currSum;
					start=i;
					end=j;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(input, start, end+1)));
	
		return sum; 
		
	}
}
