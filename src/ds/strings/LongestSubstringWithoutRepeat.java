package ds.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LongestSubstringWithoutRepeat {
	/*
	 * Given a string, find the length of the longest substring without repeating characters
	 * 
	 * Make your own assumptions
	 * Solve with worst & improve the performance
	 * 3 different strategies
	 */
	
	@Test
	public void data1() {
		String input="banana";
		System.out.println(nonRepeatingLonSubstring(input));
		System.out.println(nonRepeatingLonSubstringWin(input));
		System.out.println(nonRepeatingLonSubstringWinMap(input));
	}
	
	@Test
	public void data2() {
		String input="abcdef";
		System.out.println(nonRepeatingLonSubstring(input));
		System.out.println(nonRepeatingLonSubstringWin(input));
		System.out.println(nonRepeatingLonSubstringWinMap(input));
	}
	
	@Test
	public void data3() {
		String input="aaaaaaa";
		System.out.println(nonRepeatingLonSubstring(input));
		System.out.println(nonRepeatingLonSubstringWin(input));
		System.out.println(nonRepeatingLonSubstringWinMap(input));
	}
	
	@Test
	public void data4() {
		String input="";
		System.out.println(nonRepeatingLonSubstring(input));
		System.out.println(nonRepeatingLonSubstringWin(input));
		System.out.println(nonRepeatingLonSubstringWinMap(input));
	}
	
	@Test
	public void data5() {
		String input="bananatrs";
		System.out.println(nonRepeatingLonSubstring(input));
		System.out.println(nonRepeatingLonSubstringWin(input));
		System.out.println(nonRepeatingLonSubstringWinMap(input));
	}
	
	/* Pseudo Code - Brute Force
	 * 
	 * Divide the string to char[]
	 * Declare Variable: maxLen
	 * Using two for loops
	 * 	Outer Loop -> from 0 to length -1 (Starting point)
	 * 					Add the character in tempStr
	 * 	Inner loop -> from i+1 to length-1 (end point) - j
	 * 				Check input[j] is avialable in the temStr
	 * 				No -> Add the chrac and continue
	 * 				Yes -> Return the length (i to j) and check which is max
	 * 						Break
	 * 
	 * T - O(N2)
	 * Space - O(N)
	 */
	
	public int nonRepeatingLonSubstring(String input) {
		
		if(input.length() < 1) return -1;
		
		if(input.length() == 1) return 1;
		
		char[] inputChar=input.toCharArray();
		int maxLen=0;
		
		for (int i = 0; i < inputChar.length; i++) {
			String tempStr="";
			tempStr=tempStr+inputChar[i];
			for (int j = i+1; j < inputChar.length; j++) {
				if(tempStr.contains(inputChar[j]+"")) {
					maxLen=Math.max(maxLen, j-i);
					break;
				}
				tempStr=tempStr+inputChar[j];
				maxLen=Math.max(maxLen, j-i+1);
			}
			
		}
		
		
		return maxLen;
	}
	
	
	/* Pseudo Code - Window Sliding using Set
	 * 
	 * Declare variable: start, end, maxLen, HashSet
	 * 
	 * Iterate using while loop: (start<lengh && end<leng)
	 * 		CHeck if set contains end 
	 * 			Yes -> Remove start and increment 
	 * 			No -> Add the end in Set and increment the end
	 * 					find the max -> end-start (Math.max)
	 * 
	 * return max
	 * 
	 * T - O(N)
	 * S - O(1)
	 */
	
	public int nonRepeatingLonSubstringWin(String input) {
		
		if(input.length() < 1) return -1;
		
		if(input.length() == 1) return 1;
		
		int length=input.length();
		int maxLen=0;
		int start=0, end=0;
		Set<Character> set=new HashSet<>();
		
		while(start<length && end <length) {
			if(set.contains(input.charAt(end))) {
				set.remove(input.charAt(start));
				start++;
				
			}else {
				set.add(input.charAt(end));
				end++;
				maxLen=Math.max(maxLen, end-start);
			}
		}
		
		
		return maxLen;
	}
	/* Pseudo Code - Window Sliding Map (ContainsKey)
	 * 
	 * Declare variable: start, end, maxLen, HashMap
	 * 
	 * Iterate using while loop: (start<lengh && end<leng)
	 * 		CHeck if Map contains end 
	 * 			Yes -> Remove start and increment 
	 * 			No -> Add the end in Set and increment the end
	 * 					find the max using Math.max - maxLen & mapSize
	 * 
	 * return maxLen
	 * 
	 * T - O(N)
	 * S - O(1) 
	 */
	
	public int nonRepeatingLonSubstringWinMap(String input) {
		
		if(input.length() < 1) return -1;
		
		if(input.length() == 1) return 1;
		
		int length=input.length();
		int maxLen=0;
		int start=0, end=0;
		Map<Character, Integer> map=new HashMap<>();
		
		while(start<length && end <length) {
			if(map.containsKey(input.charAt(end))) {
				map.remove(input.charAt(start));
				start++;
				
			}else {
				map.put(input.charAt(end), end);
				end++;
				maxLen=Math.max(maxLen, map.size());
			}
		}
		
		
		return maxLen;
	}
	
}
