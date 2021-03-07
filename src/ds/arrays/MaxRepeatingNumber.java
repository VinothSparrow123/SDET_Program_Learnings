package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class MaxRepeatingNumber {
	
	/*
	 * Find the maximum repeating number with ASKII 
	 * 
	 */
	
	@Test
	public void data1() {
		int[] arr= { 9,9,3,4,5,4,4,3,3,4};
		System.out.println(getMaxRepeatingNumber(arr));
	}

	private int getMaxRepeatingNumber(int[] arr) {
		// TODO Auto-generated method stub
		int[] ref=new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			ref[arr[i]]++;
		}
		System.out.println(Arrays.toString(ref));
		int max=Integer.MIN_VALUE;
		int op=0;
		for (int i = 0; i < ref.length; i++) {
			if(max < ref[i]) {
				max=ref[i];
				op=i;
			}
		}
		System.out.println(op);
		return max;
	}
}
