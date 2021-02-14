package ArraysStrings_Week3;

import java.util.Arrays;

import org.junit.Test;

public class longestPalindrome {
	
	/*
	 * find the longest  palindrome in a given String
		input: abaababaaba
	 */
	
	
	@Test
	public void data1() {
		String input="aaabbbcccbbbaaadede";
		int longestPolindrome = longestPolindrome(input);
		
	}
//	
	/*Approach:
	 * Store the given string into a variable
	 * declare a polidrome variable with first character in the input string 
	 * Then add next character and loop to check the polindrome
	 * 
	 */
	
	private int longestPolindrome(String input) {
		
		{ 
		    // get length of input string 
		    int n = input.length(); 
		  
		    // All substrings of length 1 
		    // are palindromes 
		    int maxLength = 1, start = 0; 
		  
		    // Nested loop to mark start and end index 
		    for (int i = 0; i < input.length(); i++) { 
		        for (int j = i; j < input.length(); j++) { 
		            int flag = 1; 
		  
		            // Check palindrome 
		            for (int k = 0; k < (j - i + 1) / 2; k++) 
		                if (input.charAt(i + k) != input.charAt(j-k)) 
		                    flag = 0; 
		  
		            // Palindrome 
		            if ((flag > maxLength) && ((j - i + 1)> maxLength))  { 
		                start = i; 
		                maxLength = j - i + 1; 
		            } 
		        } 
		    }

		  
		    // return length of LPS 
		    return maxLength; 
	}
	}
}
