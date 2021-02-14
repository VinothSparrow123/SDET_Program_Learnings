package HomeWork;

import java.util.Arrays;

import org.junit.Test;

public class movePosNumbersEnd {
	
	/*Write a program to move all the positive numbers to end. 

		Input: [4, -1, 9, 0, 2, -4, 5]
		Output: [-1, 0, -4, 4, 9, 2, 5]
		
		Algorithm: Use 2 Pointer
	 */
	@Test
	public void data1() {
		int[] input= {4, -1, 9, 0, 2, -4, 5};
		int[] movePositivetoEnd = movePositivetoEndLtoR(input);
		System.out.println(Arrays.toString(movePositivetoEnd));
	}
	@Test
	public void data2() {
		int[] input= {4, 9, 0, 2, 5};
		int[] movePositivetoEnd = movePositivetoEndLtoR(input);
		System.out.println(Arrays.toString(movePositivetoEnd));
	}
	@Test
	public void data3() {
		int[] input= {-4, -1, -9, -2, -4, -5};
		int[] movePositivetoEnd = movePositivetoEndLtoR(input);
		System.out.println(Arrays.toString(movePositivetoEnd));
	}
	
	/*Two pointer approach
	 * 1. Declare left, right
	 * 2. check whether left is >0
	 * 		Yes -> Increment the right, until find right<0, then swap left with right
	 * 		No -> left++
	 * 
	 */
	
	//From left to right
	private int[] movePositivetoEndLtoR(int[] input) {
		int left=0;int right=1;
		while(left<input.length-2 && right<input.length) {
			if(input[left]>0) {
				if(input[right]<0) {
					int temp=input[left];
					input[left]=input[right];
					input[right]=temp;left++;
				}else {
					right++;
				}
			}else {left++;}
		}
		
		return input;
	}
}

