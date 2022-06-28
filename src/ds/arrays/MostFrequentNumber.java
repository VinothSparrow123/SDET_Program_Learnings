package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentNumber {
	public static void main(String[] args) {
		int[] input = {2,3,15,4,9,15,4,15,4,15};
		System.out.println(mostFrequentNumber(input));
	}
	
	/*
	 * Pseudo Code:
	 * Add all the numbers with occurances in Map
	 * Find out the max occurance and return the key of the element
	 */
	
	public static int mostFrequentNumber(int[] input) {
		
		Map<Integer, Integer> map =new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		}
		
		List<Integer> list = new ArrayList<>(map.values());
		
		Collections.sort(list);
		
		for(Map.Entry<Integer, Integer> eachKey : map.entrySet()) {
			if(eachKey.getValue() == list.get(list.size()-1)) {
				return eachKey.getKey();
			}
		}
		
		return -1;
	}
	
	private static List<Integer> maxNumber(int[] in) {
		if(in.length<1) throw new RuntimeException("Array size < 0");
		int[] count = new int[10];
		Arrays.fill(count,0);
		int max = 0;
		List<Integer> op = new ArrayList<>();
		for (int i = 0; i < in.length; i++) {
			count[in[i]]++;
			max = Math.max(max, count[in[i]]);
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				op.add(i);
			}
		}
		System.out.println(op + "is repeated for "+ max + " times");
		return op;

	}
}
