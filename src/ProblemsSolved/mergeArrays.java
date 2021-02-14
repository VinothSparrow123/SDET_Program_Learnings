package ProblemsSolved;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class mergeArrays {
	
	/*
	 * Given Two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array
	 * 
	 *  Note: 
	 *  The Number of elements initialized in nums1 and nums2 are m and n respectively.
	 *  You may assume  that nums1 has enough space (size that is equal to m+n) to hold additional elements from nums2.
	 *  
	 *  Example:
	 *  nums1={1,2,3,0,0,0}; m=3
	 *  nums2={2,5,6}; n=3
	 *  
	 *  Output: {1,2,2,3,5,6}
	 */
	
	@Test
	public void data1() {
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		mergeSortedArrays(nums1,nums2);
	}
	
	/*Pseudo Code
	 * 
	 * compare the first element of nums1 with nums2
	 * for(nums1<m)
	 * If (nums1<nums2)
	 * 		Yes-> increase nums1 and compare with the same element
	 * 		No -> Swap the nums1 with nums2
	 * 
	 * Add the rest of the elements in nums2 to nums1 using for loop
	 * for(k=m;k<nums1.length;)
	 */
	
	
	private int[] mergeSortedArrays(int[] nums1,int[] nums2) {
		
		List<Integer> list1= new ArrayList<>();
		int j=0;int i=0;
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]>nums2[j]) {
				int temp=nums1[i];
				nums1[i]=nums2[j];
				nums2[j]=temp;i++;
			}else {
				i++;
			}
		}
		
		return nums1;
	}
}
