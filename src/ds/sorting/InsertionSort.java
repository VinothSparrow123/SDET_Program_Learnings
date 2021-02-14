package ds.sorting;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {
	
	/* Sort the given array using selection sort
	 * int[] input={23, 34, 34, 15, 9, 17, 68, 45}
	 */
	
	@Test
	public void data1() {
		int[] input={23, 34, 34, 15, 9, 17, 68, 45};
		System.out.println(Arrays.toString(insertionSort(input)));
	}
	
	@Test
	public void data2() {
		int[] input={0};
		System.out.println(Arrays.toString(insertionSort(input)));
	}
	
	private int[] insertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			if(array[i-1] > array[i]) {				
				//sort the array
				int k = i;
				while(k > 0 && array[k-1] > array[k]) {
					int temp = array[k-1];
					array[k-1]=array[k];
					array[k]=temp;
					k--;
				}
			}
			//else do nothing and move to next value
		}
		return array;
	}
	
	
}
