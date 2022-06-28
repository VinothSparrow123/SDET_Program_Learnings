package Swiggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

public class ProductSort {
	/*
	In a warehouse, a manager would like to sort the items in the stock. Given an array of n item values, 
	sort the array in ascending order, first by number of items with a certain value, then by values themselves

	n=6
	items=[4,5,6,5,4,3]

	* There are 2 values that occur twice: [4,4,5,5]
	* There are 2 values that occur once: [3,6]
	* The array of items sorted by quantity ad then by value in ascending order is [3,6,4,4,5,5]

	*/
	
	@Test
	public void example1() {
		int[] nums = { 4, 5, 6, 5, 4, 3 };
		productSort(nums);
	}

	private void productSort(int[] nums) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		List<Entry<Integer, Integer>> collect = new ArrayList<>(map.entrySet());
		
		Collections.sort(collect, Map.Entry.comparingByValue());

		List<Integer> output = new ArrayList<>();
		
		for (Map.Entry<Integer,Integer> eachEntry:collect) {
			for (int i = 0; i < eachEntry.getValue(); i++) {
				output.add(eachEntry.getKey());
			}
		}
		
		System.out.println(output.toString());
//		Collections.sort(valueList);
//		
//		for (int i = 0; i < valueList.size(); i++) {
//			
//		}
	}
	
	
}
