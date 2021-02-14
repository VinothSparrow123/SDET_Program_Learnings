package Divide_Conquer;

import java.util.Arrays;

import org.junit.Test;

public class FindMajorityElement {
	
	@Test
	public void data1() {
		int[] input= {2,2,1,1,1,2,2};
		majorityElement(input);
	}
	
	@Test
	public void data2() {
		int[] input= {2,2,2,1,2,1,1,1,1};
		majorityElement(input);
	}
	
	/*
	 * Given an array of size n, find the majority element. The majority element is the element that appears more than  n/2 times.
		You may assume that the array is non-empty and the majority element always exist in the array.
		Example 1:
		Input: [3,2,3]
		Output: 3
		Example 2:
		Input: [2,2,1,1,1,2,2]
		Output: 2
		Note: Should not use built-in methods

	 */
	/*
	 * Babu's code:
	 */
	
	public int majorityElement(int[] data) {
        
        if (data.length == 1) 
            return data[0];
        
        int count = 0;
        int mid = data.length/2;
        int left = majorityElement(Arrays.copyOfRange(data, 0, mid));
        int right = majorityElement(Arrays.copyOfRange(data, mid+1, data.length));
        for (int num : data) {
            if (num == left) 
                count++;
            
            if (count > data.length/2) 
                return left;
        }
        return right;
    }

}
