package ProblemsSolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class mostFrequestElementinArray {

	/*
	 * Find the most frequest element in the array
	 * 
	 */
	
	/*Pseudo COde
	 * 
	 * Add the input array to the Map with an occurance
	 * Get the maximum occurance and it's respective key value
	 * Add the values into the list
	 * get the maximum occurance
	 * 
	 * And print the keys that have max occurance value
	 * 
	 */
	
	@Test
	public void data1() {
		int[] input= {4,5,2,1,5,4,2,1,0,1};
		System.out.println(getMostFrequestElement(input));
	}
	
	@Test
	public void data2() {
		int[] input= {1,2,3,4,5}; //All the values with same occurance
		System.out.println(getMostFrequestElement(input));
	}
	
	@Test
	public void data3() {
		int[] input= {4,4,4,4,4}; //only one value repeated
		System.out.println(getMostFrequestElement(input));
	}
	
	@Test
	public void data4() {
		int[] input= {}; //exception
		System.out.println(getMostFrequestElement(input));
	}

	
	
	public String getMostFrequestElement(int[] input) {
		
		if(input.length<1) return "No elements insde the input array";
		
		Map<Integer,Integer> map1= new HashMap<>();
		
		for(int i=0;i<input.length;i++) {
			map1.put(input[i], map1.getOrDefault(input[i], 0)+1);
		}
		
		List<Integer> list=new ArrayList<>(map1.values());
		
		int max=Collections.max(list);
		
		list.clear();
		
		for(Map.Entry<Integer, Integer> entry:map1.entrySet())
			if(entry.getValue()==max) {
				list.add(entry.getKey());
			}
		
		return list.toString()+" has repeated "+max+" times";
	}
	
}
