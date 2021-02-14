package ProblemsSolved;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class findStartIndices {
	
	/*
	 * Given 2 strings, find all the start indices of second string anagrams in first string.
		Note:
		Strings consists of lowercase letters only 
		The order of output does not matter.
		Input:
		s: "abab" p: "ab"
		Output:
		[0, 1, 2]
		Input:
		s: "testetr" p: "te"
		Output:
		[0, 3, 4]
		Sliding Window + HashMap
	 * 
	 */
	
	/*Pseudo Code
	 * 
	 * get the length of p
	 * create a empty HashMap1 - Instead of creating this can we remove the key value and occurances from HashMap2?
	 * create HashMap2 and add p (key & value)
	 * create output list to store the index
	 * iterate using for loop i=0
	 * 		inside for loop Split the string from i to p+i-1 
	 * 		Now add the string into map by splitting characters with occurances
	 * 		Then remove the key and value from p
	 * 		if HashMap1 becomes empty, return the index
	 * 			Else continue with loop
	 */
	
	@Test
	public void data1() {
		String input="abab";
		String p="ab";
		getIndicesOfAnagrams(input,p);
	}
	
	public List<Integer> getIndicesOfAnagrams(String input,String p){
		List<Integer> output=new ArrayList<>();
		
		Map<Character,Integer> map1=new HashMap<>();
		for(int i=0;i<p.length();i++) {
//			map1.put(key, value)
		}
		
		
		return output;
	}
}
