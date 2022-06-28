package ArraysStrings_Week3;

import java.util.Arrays;

public class MaxLowIndex {
	public static void main(String[] args) {
		int[] input = {1,2,3,9,4,5,5,6,7,8,9,9};
		System.out.println(Arrays.toString(getLowMaxIndices(input, 9)));
	}
	
	public static int[] getLowMaxIndices(int[] input, int target) {
		int[] output = new int[] {-1,-1};
		int left = 0,right=input.length-1;
		
		while(left<right) {
			if(input[left] == target) {
				output[0] = left;
				if(output[1] != -1) {
					break;
				}
			}else {
				left++;
				}
			if(input[right] == target) {
				output[1] = right;
				if(output[0] != -1) {
					break;
				}
			}else {
				right--;
			}
		}
//		int k=0;
//		for (int i = 0; i < input.length; i++) {
//			if(input[i] == target) {
//				output[k] = i;
//				if(k!=1) {
//					k++;
//				}
//			}
//		}
		
		return output;
	}
}
