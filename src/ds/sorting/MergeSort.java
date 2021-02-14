package ds.sorting;

import java.util.Arrays;

import org.junit.Test;

public class MergeSort {

	/* Sort the given array using selection sort
	 * int[] input={23, 34, 34, 15, 9, 17, 68, 45}
	 */

	@Test
	public void data1() {
		int[] input={23, 34, 34, 15, 9, 17, 68, 45};
		System.out.println(Arrays.toString(mergeArray(input)));
	}

	@Test
	public void data2() {
		int[] input={0};
		System.out.println(Arrays.toString(mergeArray(input)));
	}


	private int[] mergeArray(int[] array) {
		int left=0;int right=array.length-1;
		mergeSort(left,right,array);
		return array;
	}
	

	private void mergeSort(int left,int right,int[] array) {
		if(left == right) return;
		if(left<right) {
			int mid=(left+right)/2;
			mergeSort(left,mid,array);
			mergeSort(mid+1,right,array);
			merge(left,right,mid,array);
		}
	}

	private void merge(int left, int right, int mid, int[] array) {
		int[] LE=Arrays.copyOfRange(array, left, mid);
		int[] RI=Arrays.copyOfRange(array, mid, right);
		
		int i=0;
		int j=0;
		
		while(i<LE.length || j<RI.length) {
			if(i<LE.length && j<RI.length) {
				if(LE[i] < RI[j]) {
					array[left++]=LE[i++];
				}else {
					array[left++]=RI[i++];
				}
			}else if(i<LE.length) {
				array[left++]=LE[i++];
			}else {
				array[left++]=RI[j++];
			}
		}
		
	}

}
