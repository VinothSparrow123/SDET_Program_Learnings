package ds.arrays;

import org.junit.Test;

public class monotonicArray_Algorithmic {

	@Test
	public void data1() {
		int[] inputArray = { 1, 1,1,2, 3, 3, 4, 4, 4, 4, 5 };
		if (findMonoomicArray(inputArray) == true) {
			System.out.println("Given array is a monotomic array");
		} else {
			System.out.println("Given array is not a monotomic array");
		}
	}

	@Test
	public void data2() {
		int[] inputArray = { 1,1,1, 2, 5, 3, 4, 4, 4, 4, 5 };
		if (findMonoomicArray(inputArray) == true) {
			System.out.println("Given array is a monotomic array");
		} else {
			System.out.println("Given array is not a monotomic array");
		}
	}

	@Test
	public void data3() {
		int[] inputArray = { 5, 4, 2, 2, 1 };
		if (findMonoomicArray(inputArray) == true) {
			System.out.println("Given array is a monotomic array");
		} else {
			System.out.println("Given array is not a monotomic array");
		}
	}

	@Test
	public void data4() {
		int[] inputArray = { 5 };
		if (findMonoomicArray(inputArray) == true) {
			System.out.println("Given array is a monotomic array");
		} else {
			System.out.println("Given array is not a monotomic array");
		}
	}

	@Test
	public void data5() {
		int[] inputArray = { 5, 4, 3, 0, -3, -5 };
		if (findMonoomicArray(inputArray) == true) {
			System.out.println("Given array is a monotomic array");
		} else {
			System.out.println("Given array is not a monotomic array");
		}
	}

	@Test
	public void data6() {
		int[] inputArray = { 5, 4, 3, 0, 3, -3, -5 };
		if (findMonoomicArray(inputArray) == true) {
			System.out.println("Given array is a monotomic array");
		} else {
			System.out.println("Given array is not a monotomic array");
		}
	}

	@Test
	public void data7() {
		int[] inputArray = { 5, 5, 5, 5, 5 };
		System.out.println(findMonoomicArray(inputArray));
	}

	/*
	 * Approach2
	 * 
	 */

	public boolean findMonoomicArray(int[] inputArray) {
		boolean result=false;
		int flag=0;
		for(int i=1;i<inputArray.length;i++)
			if(inputArray[i-1]==inputArray[i])
				continue;
			else if(flag==0) 
				flag=((inputArray[i-1])-inputArray[i]);
			else result=((flag<0)?inputArray[i-1]<inputArray[i]:(inputArray[i-1]>inputArray[i]));
			if(result==false)
				return false;
		
		return result;
		
	}}        
	// Time Complexity of the above is: O[N] + O[N] + O[1] = O[N]