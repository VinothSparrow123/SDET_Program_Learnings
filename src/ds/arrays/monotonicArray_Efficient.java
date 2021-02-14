package ds.arrays;

import org.junit.Test;

public class monotonicArray_Efficient {

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
		int[] inputArray = { 1,2,3,3 };
		System.out.println(findMonoomicArray(inputArray));
	}



	public boolean findMonoomicArray(int[] inputArray) {
		boolean increasing = true;
		boolean decreasing = true;
		if (inputArray.length <= 1) {
			return false;
		}
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] == inputArray[i + 1]) {
				continue;} //
			if (inputArray[i] < inputArray[i + 1]) {
				decreasing = false;
			} // O[N]
			if (inputArray[i] > inputArray[i + 1]) {
				increasing = false;
			} // O[N]
		}
		return decreasing || increasing; // O[1]
	}
}

	// Time Complexity of the above is: O[N] + O[N] + O[1] = O[N]