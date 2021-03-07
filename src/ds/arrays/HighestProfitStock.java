package ds.arrays;

import java.util.Arrays;

import org.junit.Test;

public class HighestProfitStock {
	@Test
	public void data1() {
		int[] input= {12,23,34,45,12,90};
		System.out.println(getHighestStock(input));
	}
	
	private String getHighestStock(int[] input) {
		int max=0;
		int left=0;int right=left+1;
		int[] days=new int[2];
		while(left<input.length-1) {
			int currmax=input[right]-input[left];
			if(max < currmax) {
				max=currmax;
				days[0]=left;
				days[1]=right;
			}
			right++;
			if(right==input.length) {
				left++;right=left+1;
			}
		}
		return Arrays.toString(days);
	}
}
