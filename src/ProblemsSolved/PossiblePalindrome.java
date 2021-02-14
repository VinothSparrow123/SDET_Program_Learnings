package ProblemsSolved;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PossiblePalindrome {
	/*
	 * Input: "aaa"
		Output: 6
		Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
	 */
	
	@Test
	public void data1() {
		String input= "aaa";
		getAllPossiblePalindrome(input);
	}

	
	/* Pseudo Code
	 * 
	 * if the length of the string is equal to zero return an exception
	 * Split the string into characters
	 * Initialize one list and all character into the string
	 * 
	 * Iterate using for loop till length/2
	 * 	Find the mid, and check left and right elements are equal
	 * 		If yes, derive a substring from left to right and add it into the list
	 * 
	 */
	

	private List<String> getAllPossiblePalindrome(String input) { 
		
		List<String> possList=new ArrayList<>();
		
		for (int i = 0; i < (input.length()/2); i++) {
			//solution available in document: Sorting_Jan09th
		}
		
		
		return possList;
	}
	
}
