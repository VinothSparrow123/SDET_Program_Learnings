package ProblemsSolved;

import java.util.Arrays;

import org.junit.Test;

public class QuickSort {
	
	@Test
	public void data() {
		
	}
	
	/*
	 * Partion(arr,left,right)
		steps 1-7
		returns the partition
		 quickSort(){
		 int mid = Partion(arr,left,right);
		quickSort(arr,left,mid);
		quickSort(arr,mid+1,right);
		}
	 * 
	 */
	/*
	Pseudo code - Quick sort
	Recursion method - Partion(arr,left,right)
		follow steps 1-7 for quick sort
		returns the partition
	quickSort:
		int mid = Partion(arr,left,right);
		quickSort(arr,left,mid);
		quickSort(arr,mid+1,right);
		
	 */	
		@Test
		public void TestData1() {
			int arr[] = {11,4,7,2,1,3,21,213};
//			System.out.println(Arrays.toString(quickSort(arr)));
		}
		
		@Test
		public void TestData2() {
			int arr[] = {3,4,7,2,1,3,21,213};
//			System.out.println(Arrays.toString(solution(arr)));
		}
		@Test
		public void TestData3() {
			int arr[] = {2,3,4};
//			System.out.println(Arrays.toString(solution(arr)));
		}
		
//		private int[] solution(int arr[]){
////			int mid = partition(arr,left,right);
////			quickSort(arr,left,mid);
////			quickSort(arr,mid+1,right);
////			return arr;
//		}

		private void partition(int[] arr) {
//			int mid=quickSort(arr,left,right);
		}

	
}
