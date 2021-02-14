package ProblemsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FirstAndLastMatchGivenElement {
	/*
     * Given an Array, find the first & last match of the element
     * 
     * Example 1:
     * Input: [11,14,17,19,19,19,23,25]
     * target: 19
     * Output: [3,5]
     * 
     * Example 2:
     * Input: [11,14,17,19,19,19,23,25]
     * Target 23
     * Output: [6,6]
     * 
     */
	
	@Test
	public void data1() {
		int[] input= {1,3,4,9,12,12,12,12,45,67};
		int target=12;
//		System.out.println(Arrays.toString(getFirstLastIndexBF(input,target)));
//		System.out.println(Arrays.toString(getFirstLastIndexUsingList(input,target)));
		System.out.println(Arrays.toString(getFirstLastIndexUsingBinary(input,target)));
		
		
		
	}
	
//	@Test
	public void data2() {
		int[] input= {11,14,17,19,19,19,23,25};
		int target=23;
//		System.out.println(Arrays.toString(getFirstLastIndexBF(input,target)));
//		System.out.println(Arrays.toString(getFirstLastIndexUsingList(input,target)));
		System.out.println(Arrays.toString(getFirstLastIndexUsingBinary(input,target)));
	}
	
//	@Test
	public void data3() {
		int[] input= {11,14,17,19,19,19,23,25};
		int target=18;
//		System.out.println(Arrays.toString(getFirstLastIndexBF(input,target)));
//		System.out.println(Arrays.toString(getFirstLastIndexUsingList(input,target)));
		System.out.println(Arrays.toString(getFirstLastIndexUsingBinary(input,target)));
	}
	
	@Test
	public void data4() {
		int[] input= {18,18,18,18,18,18};
		int target=18;
//		System.out.println(Arrays.toString(getFirstLastIndexBF(input,target)));
//		System.out.println(Arrays.toString(getFirstLastIndexUsingList(input,target)));
		System.out.println(Arrays.toString(getFirstLastIndexUsingBinary(input,target)));
	}
	
	/* Pseudo Code - Brute Force - Two for loops
	 * 
	 * declare int[] out= {-1,-1};
	 * Incremental For loop iterate from 0
	 * 		If value matches target -> assign out[0] = i, Then break
	 * Decremental For loop iterate from array length
	 * 		If value matches target -> assign out[1] = i, Then break
	 * return out;
		
	* Time - O(N) + O(N) - O(N)
	 * Space - O(1)
	 * 
	 
	 */
	
	public int[] getFirstLastIndexBF(int[] input,int target) {
		int[] out= {-1,-1};
		for (int i = 0; i < input.length; i++) {
			if(input[i] == target) {
				out[0]=i;
				break;
			}
			
		}
		for (int i = input.length-1; i >=0; i--) {
			if(input[i] == target) {
				out[1]=i;
				break;
			}
			
		}
		return out;
	}
	
	
	/*Pseudo code - Two POinter
	 * 
	 * Declare variables: Left=0, Right=input.length-1, int[] out= {-1,-1};
	 * 
	 * While (left <input.length && right >0)
	 * if value of left, equals to target
	 * 		Yes -> out[0]=left
			No -> left++
		If value of right, equal to target
			Yes -> out[1]=left
			No -> right--
			
	* Time - O(N)
	 * Space - O(1)
	*/
	
	private void getFirstLastIndex(int[] input,int target) {
		int left=0;
		int right=input.length-1;
		int[] out= {-1,-1};
		
//		while(left)
		
	}
	
	/* Pseudo Code - Using List
	 * 
	 * Converting the integer array to List
	 * To get the first occurance -> indexOf function
	 * To get the last occurance -> lastIndexOf function
	 */
	
	public int[] getFirstLastIndexUsingList(int[] input,int target) {
		
		List<Integer> output=new ArrayList<>();
		
		for (Integer eachInt : input) {
			output.add(eachInt);
		}
		
		return new int[] {output.indexOf(target) , output.lastIndexOf(target)};
	}
	
	/* Pseudo Code - Binary search
	 * 
	 * 
	 * Int left=0;int right=lengh-1;mid=left+right/2
	 * If value of mid > target
	 * 		right=mid-1;
	 * else if mid <target
	 * 		left=mid+1;
	 * 
	 * 
	 * 
	 */
	
	public int[] getFirstLastIndexUsingBinary(int[] input,int target) {
		
		int left=getLastOrFirstIndex(input,target,true);
		int right=getLastOrFirstIndex(input,target,false);
		return new int[] {left,right};
	}
	
	private int getLastOrFirstIndex(int[] input, int target,boolean flag) {
		
		int left=0;int right=input.length-1;
		int temp=-1;
		
		
		while(left <= right) {
			int mid=(left+right)/2;
			if(input[mid] == target) {
				temp=mid;
				if(flag ==true)
					right=mid-1;
				else {
					left=mid+1;
				}
			}else if(input[mid] > target) {
				right=mid-1;
			}else left=mid+1;
			
		}
		return temp;
		//11,14,17,19,19,19,23,25
	}

	
	
	/* Pseudo Code - Using HashMap
	 * 
	 * 
	 */
	
	/* Pseudo Code - Using Set
	 * 
	 * Intialize the set
	 * declare out[] ={-1,-1}
	 * 
	 * Using for loop add the array element into the set
	 * 		if (array[i] == target && set.add)
	 * 			Assign the i value to both the out indexes
	 * 		else if(array[i] ==target && !set.add)
	 * 			Assign the i value to second index of out
	 * 
	 */
	
	public int[] getFirstLastIndexSet(int[] input,int target) {
		int[] out= {-1,-1};
		Set<Integer> set=new HashSet<>();
		
		for (int i = 0; i < input.length; i++) {
//			if(input[])
			
		}
		
		return out;
	}
}
