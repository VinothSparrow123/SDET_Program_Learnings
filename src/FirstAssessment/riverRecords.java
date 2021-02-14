package FirstAssessment;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class riverRecords {
	
	/*River Records - Question 2
	 * Given an array of integers, without reordering, determine the maximum
		difference between any element and any prior smaller difference. If
		there is never a lower prior element, return -1.
	 */
	
	@Test
	public void data1() {
		Integer[] data = {5,3,2,2,1,1};
		List<Integer> lst = Arrays.asList(data);
//		System.out.println(findPriorSmallerDiff(lst));
		System.out.println(maxTrailing(lst));
	}
	
	@Test
	public void data2() {
		int[] input= {7,3,2,1,0};
		System.out.println(findPriorSmallerDiff(input));
	}
	
	@Test
	public void data3() {
		int[] input= {-1,3,5,-7,9,12};
		System.out.println(findPriorSmallerDiff(input));
	}
	
	@Test
	public void data4() {
		int[] input= {1};
		System.out.println(findPriorSmallerDiff(input));
	}
	
	/*Approach1
	 * CHeck the given array is having more than one integers
	 * 	If not, return error
	 * 	If yes, get the second element and compare it with the previous one. Store the different into a variable
	 * 	Iterate the same operation until the last element
	 * Finally return the maximum difference
	 * 
	 */
	
	private int findPriorSmallerDiff(int[] input){
		if(input.length<2) {
			System.out.println("Invalid input for valdiation");
		}
		int currentMax=0;
		int prevMax=0;
		int count=0;
		for (int i = 0; i < input.length-1; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[j]>input[i]) {
					int temp=currentMax;
					currentMax=Math.subtractExact(input[j], input[i]);
					currentMax=Math.max(currentMax,prevMax);
					prevMax=temp;
				}
				if(input[j]<input[i]) {
					count++;
				}
			}
		}
		if(input.length==count) { //this is not working as we are comparing one element with all the elements with
			currentMax=-1;			//two loops. Have to find out the way
		}
		
		return currentMax;
	}
	
//	private int riverRecords(int[] input) {
//		
//		int currentMax=0;
//		int prevMax=0;
//		int count=0;
//	}
	private int maxTrailing(List<Integer> arr) {

		int maxDiff = 0, max = arr.get(arr.size() - 1);
		for (int i = arr.size() - 2; i >= 0; i--) {
			max = Math.max(max, arr.get(i));
			maxDiff = Math.max(maxDiff, max - arr.get(i));
		}
		return maxDiff == 0 ? -1 : maxDiff;
	}
}
