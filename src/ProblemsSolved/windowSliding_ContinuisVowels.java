package ProblemsSolved;

public class windowSliding_ContinuisVowels {
	
	/*
	  Given a string s and an integer k.
	  Return the maximum number of vowel letters [exact first match] in any substring of s with length k.
	  Vowel letters in English are (a, e, i, o, u).
	  Example 1:
		Input: s = "abciiidef", k = 3
		Output: iii
		Explanation: The substring "iii" contains 3 vowel letters.
		Example 2:
		Input: s = "aeiou", k = 2
		Output: ae
	 * 
	 */

	
	/*
     * Pseudo-code:
     * Store all vowels in list array as character
     * declare two pointer left,right - starts at left
     * iterate an string and compare - list.contains(str.charAt[left])
     * if yes - count++; right++ (count should not exceed k)
     * if (count>k){return characters from i to j}
     * Edge case : -> if(count!=K) return -1
     * if no- left++  assign right=left;
     * 
     * e.g: viothe i o
     */
	
	

}
