package ds.sorting;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
	/* Sort the given array using bubble sort
	 * int[] input={23, 34, 34, 15, 9, 17, 68, 45}
	 */
	
	@Test
	public void data1() {
		int[] input={23, 34, 34, 15, 9, 17, 68, 45};
		System.out.println(Arrays.toString(bubbleSort(input)));
	}
	
	/* Pseudo Code
	 * 
	 * for(int i=length-1;i>=0;i--)
	 * 
	 */
	
	private int[] bubbleSort(int[] input) {
		for(int i=input.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(input[j] > input[j+1]) {
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
			
		}
		
		return input;
	}
	
	private int[] solution(int arr[]){
		int right = arr.length-1;
		
		
		for(int i=right;i>0;i--) {
			for(int j=1;j<i;j++) {
				if(arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
