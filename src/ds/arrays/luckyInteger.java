package ds.arrays;

import java.util.Arrays;

import org.junit.Test;


public class luckyInteger {
	
	@Test
	public void data1() {
		int[] inputArray= {1,2,3,4,5};
		int[] sortedSquaredArray= findSquareOfGivenArray(inputArray);
		for (int i = 0; i < inputArray.length; i++) 
            System.out.print(sortedSquaredArray[i] + " ");
	}
	
	@Test
	public void data2() {
		int[] inputArray= {-1,2,-5,3,4,-4,0,4,4,5};
		int[] sortedSquaredArray= findSquareOfGivenArray(inputArray);
		for (int i = 0; i < inputArray.length; i++) 
            System.out.print(sortedSquaredArray[i] + " ");
	}
	
	@Test
	public void data3() {
		int[] inputArray= {5};
		int[] sortedSquaredArray= findSquareOfGivenArray(inputArray);
		for (int i = 0; i < inputArray.length; i++) 
            System.out.print(sortedSquaredArray[i] + " ");
	}
		
	/*Approach 1
		1. Get the given array and sort it in the ascending order
		2. Now multiply the i th element with i which will return the square of that i th element
		3. After the square add it into the array
		4. Now sort the squared values
		
	*/	
	private int[] findSquareOfGivenArray(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			inputArray[i]=inputArray[i]*inputArray[i]; //O[N]
		}
//		Arrays.sort(inputArray); //inbuilt function //O(logN)
		
		//sorting the squared values
		int temp;
		for(int j=0;j<inputArray.length-1;j++) {
			for(int k=j+1;k<inputArray.length;k++) {
				if(inputArray[j]>inputArray[k]) {
					temp=inputArray[j];
					inputArray[j]=inputArray[k];
					inputArray[k]=temp;
				}
			}
		}
		
		return inputArray;
	}

}
