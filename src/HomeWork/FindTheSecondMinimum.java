package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FindTheSecondMinimum {
	
	/*
	 * Write a program to fetch second minimum in the given array
	 * 
	 */

	
	@Test
	public void data1() {
		int[] inp= {4,2,11,1,23,2,3,15,14};
		System.out.println(findSecondMinimum_forloop(inp));
//		System.out.println(findSecondMinimum_Sort(inp));
	}
	
	@Test
	public void data2() {
		int[] inp= {4,2,11,1,23,2,-1,3,15,-1};
		System.out.println(findSecondMinimum_forloop(inp));
//		System.out.println(findSecondMinimum_Sort(inp));
	}
	
	/* Pseudo Code
	 * 
	 * Declare variables called Min, secondMin
	 * Iterate Using single for loops
	 * 		if the value is lesser than Min assign it with Min
	 * 		if the value is greater than Min and lesser than secondMin, assign it with secondMin
	 */
	
	private int findSecondMinimum_forloop(int[] inp) {
		int min=Integer.MAX_VALUE;int secondMin=Integer.MAX_VALUE;
		
		for (Integer eachint:inp) {
			secondMin=min;
			min=Math.min(eachint, min);
			if(eachint > min && eachint <secondMin) {
				secondMin=eachint;
			}
		}
		
		return secondMin;
	}
	
	
	/* Pseudo Code - Using Sorting
	 * 
	 * Sort the input array and add it into the set
	 * Return the second element from the starting
	 */
	
	private int findSecondMinimum_Sort(int[] inp) {
		
		Set<Integer> set=new HashSet<>();
		for (Integer eachInt:inp) {
			set.add(eachInt);
		}
		List<Integer> list=new ArrayList<>(set);
		
		Collections.sort(list);
		
		return list.get(1);
	}
	
	/*Pseudo Code - Brute Force
	 * 
	 * 
	 */
	
	
	//Another approach available in DummyDoc
	
}
