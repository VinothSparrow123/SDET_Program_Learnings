package ProblemsSolved;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class removeInstances {
	/*Given an array of numbers and a specific number (n), remove all instances of that number (n) and return the new length.
		Input: numbers = [0,1,2,2,3,0,4,2], number = 2
		Output: 5
		numbers = [0,1,4,0,3]
	 * 
	 */

	/*Two Pointer approach
	 * 1. Initialize one ArrayList
	 * Using while loop, 
	 * 	If value of numbers[i]=k, increase i++
	 * 	Else add it into the array list
	 * return the size of an arrayList
	 * 
	 */

	@Test
	public void data1() {
		int[] numbers = {0,1,2,2,3,0,4,2};
		int k=2;
		removeInstances(numbers,k);
	}

	@Test
	public void data2() {
		int[] numbers = {0,1,2,2,3,0,4,2};
		int k=7;
		System.out.println(removeInstances(numbers,k));
	}

	@Test
	public void data3() {
		int[] number = {2,2,2};
		int k=2;
		System.out.println(removeInstances(number,k));
	}

	private int removeInstances(int[] number,int k) {
		List<Integer> list=new ArrayList<Integer>();

		//		int i=0;
		//		while(i<number.length-1) {
		for(int i=0;i<number.length;i++) {
			if(number[i]!=k) {
				list.add(number[i]);
			}
		}
		System.out.print(list.toString());

		return list.size();
	}
	
	private int removeInstances2(int[] number,int k) {
		List<Integer> list=new ArrayList<Integer>();

		//		int i=0;
		//		while(i<number.length-1) {
		for(int i=0;i<number.length;i++) {
			if(number[i]!=k) {
				list.add(number[i]);
			}
		}
		System.out.print(list.toString());

		return list.size();
	}
}
