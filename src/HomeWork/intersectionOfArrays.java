package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class intersectionOfArrays {
	
	/*
	 * Given two arrays,find the intersection of 2 arrays.

		Input: nums1 = [11,2,12,1], nums2 = [2,12]
		Output: [2,12]
		
		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		Output: [9,4]
		
		Algorithm: Use 2 Pointer
	 */
	
	@Test
	public void data1() {
		int[] nums1 = {11,2,12,1};
		int[] nums2 = {2,12};
		String findIntersection = findIntersection2(nums1,nums2);
		System.out.println(findIntersection);
	}
	
	@Test
	public void data2() {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		findIntersection(nums1,nums2);
	}
	
	/*Two pointer
	 * 
	 * Iterate using while loop with twp pointer (one pointer in nums1 and another pointer in nums2)
	 * Compare the nums1 pointer with nums2
	 * 	If it equals -> Store it in new array
	 * 	IF it didn't equals -> move the pointer in nums2 compare... Continue untill nums2 reaches the max length
	 * When nums2 reach the max length, we need to increase the nums1 pointer
	 * 
	 */
	
	
	private String findIntersection(int[] nums1,int[] nums2) {
		int left1=0;int left2=0;
		
		List<Integer> intersec=new ArrayList<>();
		
		while(left1<nums1.length && left2<nums2.length) {
			
			if(nums1[left1]==nums2[left2]) {
				intersec.add(nums1[left1]);
				left1++;left2=0;
			}else{left2++;}
			if(left2==nums2.length-1) {
				left1++;left2=0;
			}
		}
		
		
		return Arrays.toString(intersec.toArray());
	}
	
	
	public String findIntersection2(int[] nums1,int[] nums2) {
		
		List ls=Arrays.asList(nums1);
		List<Integer> inter=new ArrayList<>();
		
		int i=0;
		while(i<nums2.length) {
			if(ls.contains(nums2[i])) {
				inter.add(nums2[i]);
			}else {continue;}i++;
		}
		
		return Arrays.toString(ls.toArray());
	}
}
