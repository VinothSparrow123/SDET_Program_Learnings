package ds.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PairsOfPalindrome {
	/*
	 * Facebook Given a list of unique words, return all pairs of distinct indices
	 * that can form the palindrome 
	 * Example 1: Input: {“bat, “ball”, “tab”} Output:
	 * {{0,2}. {2,0}} 
	 * Example 2: Input: {“hey", "lehe”, "l”, “eh"} Output: {{0,3}.
	 * {1,2}} 
	 * Example 3: Input: {“aba", "”} Output: {{0,1}. {1,0)} Example 4: Input:
	 * {“abc", “def”} Output: {}
	 */
	
	@Test
	public void data1() {
		String[] input={"bat", "ball", "tab"};
		System.out.println(returnIndexedOfPalindrome(input));
	}
	
	@Test
	public void data2() {
		String[] input={"hey", "lehe","l", "eh"};
		System.out.println(returnIndexedOfPalindrome(input));
	}
	
	@Test
	public void data3() {
		String[] input={"aba", "", "tab"};
		System.out.println(returnIndexedOfPalindrome(input));
	}
	@Test
	public void data4() {
		String[] input={"abc", "tab"};
		System.out.println(returnIndexedOfPalindrome(input));
	}
	
	/* Pseudo Code - Brute Force
	 * 
	 * Declare List<List>
	 * 
	 * Iterate using Two for loops
	 * 	Outerloop - i 0 to length -1
	 * 	Inner loop - i+1 till lengh-1
	 * 		add the value for outer loop and inner loop index in stringbuffer
	 * 		Check if palindrome
	 * 			Yes -> Add both the indexes in list and add that list in List<List>
	 * 			No -> continue
	 * 
	 * Time - O(N2)
	 * Space - O(1)
	 * 
	 */
	
	private List<List<Integer>> returnIndexedOfPalindrome(String[] input) {
		
		List<List<Integer>> output=new ArrayList<>();
		
		if(input.length<2) return output;
		
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(i==j) continue;
				StringBuffer sb=new StringBuffer();
				sb.append((input[i]+input[j]).trim());
				if(sb.toString().equals(sb.reverse().toString())) {
					output.add(new ArrayList(Arrays.asList(i,j)));
				}
			}
		}
		
		return output;
	}
	
	/* Pseudo Code - Hashing
	 * 
	 *Declare List<List>
	 *
	 * 
	 */
	
}
