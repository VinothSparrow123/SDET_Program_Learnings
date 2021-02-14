package ProblemsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class shortestFormWithRank {
	
	/*  Shortest form of array with Rank
	 * input={10,2,1,4,10,2,5,13,5}
	 * 
	 */
	@Test
	public void data1() {
		int[] input={10,2,1,4,10,2,5,13,5};
		getShortestFormWithRank(input);
	}
	
	@Test
	public void data2() {
		int[] input={10,2,1,4,10,2,5,13,5};
		getShortestFormWithRank(input);
	}
	
	/*Pseudo Code - window sliding
	 * 
	 * Declare variable: left=0, right=input.length-1
	 * Declare one List<Map<Integer,Integer>> to store the divided value and it's occurance
	 * 
	 * Using two pointer get the duplicate set an store it into the List<Map<Integer,Integer>>
	 * While condition - (left<input.length-1 && right>left)
	 * a) hold the first value of the input in left 
	 * b) compare it with right value
	 * 			If it matches -> add the value with occurance into map 
	 * 			If not -> decrement the right
	 *
	 * add all the values in new list and get the maximum occurance
	 * Using for loop, iterate each map and find the key having the maximum occurance
	 *		Assign that key as Rank
	 *
	 */
	
	public void getShortestFormWithRank(int[] input) {
		
//		List<List<Integer>> dupList=new ArrayList<>();
		List<Map<Integer,Integer>> duplilist=new ArrayList<>();;
		
		int left=0;int right=input.length-1;
		
		//dividing the input based on the duplicates
		while(left<input.length-1 && right>left) {
//			List<Integer> lst=new ArrayList<>();
			Map<Integer,Integer> map=new HashMap<>();
			if(input[left] == input[right]) {
				for(int i=left;i<=right;i++) {
					map.put(input[i], map.getOrDefault(input[i], 0)+1);
				}
				duplilist.add(map);
				left++;right=input.length-1;
			}else {right--;}
			if(right == left+1) {
				left++;right=input.length-1;
			}
		}
		
		System.out.println(duplilist.toString());
		
		int i=0;
		int max=0; int maxindex=0;int rank=0;
		
		while(i<duplilist.size()) {
			for (int j=0;j<duplilist.get(i).size();j++) {
				List<Integer> values=new ArrayList<>(duplilist.get(i).values());
				int currmax=Collections.max(values);
				if(currmax>=max) {
					max=currmax;
					maxindex=i;
				}
				for (Map.Entry<Integer,Integer> eachentry : duplilist.get(i).entrySet()) {
					if(eachentry.getValue()==max) {
						rank=eachentry.getKey();
					}
				}
			}
			i++;
		}
		
		
		System.out.println(duplilist.get(maxindex)+" and the rank is "+rank);
		
	} 
	
	/*Approach:
	 * 
	 * Find the 
	 * 
	 */
	
	public void getRank(int[] input) {
		
		Map<Integer,Integer> rankMap=new HashMap<>();

		int maxRank=0;
		
		for(int i=0;i<input.length;i++) {
			rankMap.put(input[i], rankMap.getOrDefault(input[i], 0)+1);
			maxRank=Math.max(maxRank, rankMap.get(input[i]));
		}
		
		
		for(Map.Entry<Integer, Integer> eachEntry:rankMap.entrySet()) {
			if(eachEntry.getValue()==maxRank) {
				eachEntry.getKey();
			}
		}
		
		
	}
}
