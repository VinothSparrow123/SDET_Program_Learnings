package ProblemsSolved;

import org.junit.Test;

public class GroupAnagrams {
	
	/*Given an array of strings strs, group the anagrams together. 
	 * You can return the answer in any order. 
	 * Example 1: 
	 * Input: strs = ["eat","tea","tan","ate","nat","bat"] 
	 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]] 
	 * List<List<String>>
	 * 
	 */
	
	@Test
	public void data1() {
		
	}
	
	/*
	 * Test Data
	 * 
	 * Valid data - strs = ["eat","tea","tan","ate","nat","bat"]
	 * Non matching words - ["eat","yet"]
	 * matching words in diff lenth - ["eat","teaa"]
	 * Null or Empty
	 * 
	 */
	
	/*
	 * pseudo code :
			Check the input size is greater than zero - While - (list.length > 0)
				
				for(int i)
					sort each
				first=0;
				for (second=first+1)
					if(input[first].equals(input[second)]
						add to list
					
				add the list[i] to a HashMap
				call the recusiveMethod
			
			create a recursive method (HashMap, list)
				
				
				remove the value from list
				if(HashMap.add(char in list [i])))
				
	 */

}
