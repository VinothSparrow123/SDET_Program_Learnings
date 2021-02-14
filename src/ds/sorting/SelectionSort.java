package ds.sorting;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	/* Sort the given array using selection sort
	 * int[] input={23, 34, 34, 15, 9, 17, 68, 45}
	 */
	
	@Test
	public void data1() {
		int[] input={23, 34, 34, 15, 9, 17, 68, 45};
		System.out.println(Arrays.toString(selectionSort(input)));
	}
	
	@Test
	public void data2() {
		int[] input={0};
		System.out.println(Arrays.toString(selectionSort(input)));
	}
	
	private int[] selectionSort(int[] array) {
		
		int n=array.length;
		
		if(n <= 1)
			return array;
		
		for (int i = 0; i < n ; i++){  
            int pivot1 = i;  
            for (int j = i + 1; j < n; j++){  
                if (array[j] < array[pivot1]){  
                    pivot1 = j; 
                }  
            }  
            int small = array[pivot1];   
            array[pivot1] = array[i];  
            array[i] = small;  
        }
		return array;
	}
	
	
}
