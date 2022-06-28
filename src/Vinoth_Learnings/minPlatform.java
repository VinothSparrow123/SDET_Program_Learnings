package Vinoth_Learnings;

import java.util.Arrays;

import org.junit.Test;

public class minPlatform {
	/*
	 * Given an arrival and departure times of all trains that reach a railway
	 * station, the task is to find the minimum number of platforms required for the
	 * railway station so that no train waits
	 * 
	 * Input: arrival[] = { 9:00, 9:40, 9:50, 11:00, 15:00, 18:00} departure[] = {
	 * 9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
	 */

	@Test
	public void data1() {
		int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200,1120,1130, 1900, 2000 };
		Arrays.sort(dep);
		System.out.println(findMininumReqPlatform(arr, dep));
	}

	private int findMininumReqPlatform(int[] arr, int[] dep) {
		int minPlatform = 1;
		int n=arr.length-1;
		for (int i = n; i >= 0; i--) {
			for (int j = i-1; j >= 0; j--) {
				if(arr[i] <= dep[j] && arr[i] >= arr[j]) {
					minPlatform++;
				}
			}
		}
		
		return minPlatform;
	}
}
