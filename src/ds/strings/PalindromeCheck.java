package ds.strings;

import java.util.HashSet;
import java.util.Set;

public class PalindromeCheck {
	/*
	 * Given a string, validate and confirm if we can make a palindrome or not.

		//Pseudo Code
		Have two pointers
		Iterate Using while loop untill left<right
			Navigate from both directions
			check if right and left elements are equal
			If so, continue
			else return false
		return true
	 */
	
	/*
	 * 
	 */
	
	public boolean isPalindromeCheck(String input) {
		
		char[] inputch=input.toCharArray();
		int len=inputch.length;
		
		Set<Character> set=new HashSet<>();
		
		for (int i = 0; i < inputch.length; i++) {
			if(!set.add(inputch[i]))
				set.remove(inputch[i]);
			
		}
		
		if(set.size() >1) return false;
		
		return true;
	}
	
}
