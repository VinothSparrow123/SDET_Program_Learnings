package ProblemsSolved;

import org.junit.Test;

public class secondGreatestNumber {
	
	/*
	 * Find the second greatest number in an array without using collection concepts.
	 * input: {2,1,3,5,4,11,33,26}
	 * 
	 * output: 26
	 */
	
	@Test
	public void data1(){
		int[] input= {2,1,3,5,4,11,33,26};
		System.out.println(secondLargest(input));
	}
	
	@Test
	public void data2(){
		int[] input= {2,2,2,2,2,2,2};
		System.out.println(secondLargest(input));
	}
	
	@Test
	public void data3(){
		int[] input= {2,-2,-1,-26};
		System.out.println(secondLargest(input));
	}
	
	@Test
	public void data4(){
		int[] input= {};
		System.out.println(secondLargest(input));
	}
	
	@Test
	public void data5(){
		int[] input= {-2};
		System.out.println(secondLargest(input));
	}
	
	/*Approach
	 * 
	 * Sort the input array with 2 pointer concept
	 * Return the element in index (length-2)
	 */
	
	public int getSecondLargest(int[] input){
		
		int left=0;int right=left+1;
		
//		if(input.length<1) {return new Exception("invalid input");}
		
		while (left < input.length) {
			if(input[left]>input[right]) {
				int temp = input[left];
				input[left] = input[right];
				input[right]=temp;left++;
				right=left+1;
			}else {
				right++;
			}
			if(right>=(input.length-1)) {
				right=left+1;left++;
			}
		}
		return input[(input.length)-2];
	}
	
	/*other approach
	 * 
	 * We can add element and its index into a map (Key - Element, value - Index)
	 * store the elements in an Arraylist and sort it
	 * get the 
	 */
	
	
	/*
	 * Declare largest and secondlargest variable
	 * Find the largest value in the array by using for loop
	 * using another for loop, try to find the secondlargest value by ignoring largest
	 * 	if(input[i] != largest)
	 * 		secondlargest=math.max(second,input[i])  
	 * 
	 */
	public int secondLargest(int[] input) {
		
		if(input.length<2) {throw new IllegalArgumentException("no second largest element");}
		
//		int largest=input[0];int secondLargest=input[0];
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<input.length;i++) {
			largest=Math.max(largest, input[i]);
		}
		
		for(int i=0;i<input.length;i++) {
			if(input[i] != largest) {
				secondLargest=Math.max(secondLargest,input[i]);
			}
		}
		if(secondLargest == largest || secondLargest==Integer.MIN_VALUE ) {
			throw new IllegalArgumentException("no second largest element");
		}
		
		return secondLargest;
	}
}
