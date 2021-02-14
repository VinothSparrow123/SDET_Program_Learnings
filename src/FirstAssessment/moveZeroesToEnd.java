package FirstAssessment;

import java.util.Arrays;

import org.junit.Test;

public class moveZeroesToEnd {
	
	/*Move zeroes to an end
	 * Approach:
	 * identify the non-zero elements and align it from the base position
	 * THen iterate the loop to add zero from the ending of non zero position to length of the array
	 */
	
	@Test
	public void data1() {
		int[] input= {0,2,1,0,5,0,3,12};
		System.out.println(moveZeorsEnd(input));
	}
	
	@Test
	public void data2() {
		int[] input= {2,1,5,3,12};
		System.out.println(moveZeorsEnd(input));
	}
	
	private String moveZeorsEnd(int[] input) {
		
		int count=0;
		for (int i = 0; i < input.length; i++) {
			if(input[i]!=0) {
				input[count++]=input[i];
			}
		}
		for(int j=count;j<input.length;j++) {
			input[j]=0;
		}
		
		return Arrays.toString(input);
		
	}

}
