package ProblemsSolved;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MinimumNumberOfStepsToMakeToStringsAnagram {
	/*
	 * Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.

		Return the minimum number of steps to make t an anagram of s.
		
		An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
		
		 
		
		Example 1:
		
		Input: s = "bab", t = "aba"
		Output: 1
		Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
		Example 2:
		
		Input: s = "leetcode", t = "practice"
		Output: 5
		Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
		Example 3:
		
		Input: s = "anagram", t = "mangaar"
		Output: 0
		Explanation: "anagram" and "mangaar" are anagrams. 
		Example 4:
		
		Input: s = "xxyyzz", t = "xxyyzz"
		Output: 0
		Example 5:
		
		Input: s = "friend", t = "family"
		Output: 4
	 */
	
	@Test
	public void data1() {
		String s1 = "bab";
		String s2 = "aba";
		System.out.println(getMinStepsToMakeAnAnagram(s1,s2));
	}

	@Test
	public void data2() {
		String s1 = "leetcode";
		String s2 = "practice";
		System.out.println(getMinStepsToMakeAnAnagram(s1,s2));
	}
	
	@Test
	public void data3() {
		String s1 = "anagram";
		String s2 = "mangaar";
		System.out.println(getMinStepsToMakeAnAnagram(s1,s2));
	}
	
	@Test
	public void data4() {
		String s1 = "xxyyzz";
		String s2 = "xxyyzz";
		System.out.println(getMinStepsToMakeAnAnagram(s1,s2));
	}
	
	@Test
	public void data5() {
		String s1 = "friend";
		String s2 = "family";
		System.out.println(getMinStepsToMakeAnAnagram(s1,s2));
	}
	
	/*Pseudo Code
	 * 
	 * If the length of the two strings are not equal return an exception
	 * 
	 * declare two maps
	 * Add the occurances of each string in each map
	 * 
	 * Compare the ket
	 * 
	 */
	

	private int getMinStepsToMakeAnAnagram(String s1, String s2) {
		
		Map<Character,Integer> map1=new HashMap<>();
		Map<Character,Integer> map2=new HashMap<>();
		
		int count=0;
		
		for (Character eachChar : s1.toCharArray()) {
			map1.put(eachChar, map1.getOrDefault(eachChar, 0)+1);
		}
		
		for (Character eachChar : s1.toCharArray()) {
			map2.put(eachChar, map1.getOrDefault(eachChar, 0)+1);
		}
		
		if(map1.equals(map2)) {
			return count;
			}
		
		for (Map.e iterable_element : iterable) {
			
		}
		
		return count;
	}
	
}
