package ds.arrays;

import org.junit.Test;

public class CheckPalindrome {
	/*
	 * Given a string, determine if it is palindrome
		
		Constraints:
		
		 - Only alphanumeric characters
		 - Ignore the cases
		
		3 Diff approaches - 30 Minutes !!
	 * 
	 */
	
	@Test
	public void data1() {
		String input="21ababa12";
		System.out.println(checkPalindromeBF(input));
		System.out.println(checkPalindromeTP(input));
		System.out.println(checkPalindromeLinear(input));
	}
	
	@Test
	public void data2() {
		String input="vinoth123";
		System.out.println(checkPalindromeBF(input));
		System.out.println(checkPalindromeTP(input));
		System.out.println(checkPalindromeLinear(input));
	}
	
	@Test
	public void data3() {
		String input="";
		System.out.println(checkPalindromeBF(input));
		System.out.println(checkPalindromeTP(input));
		System.out.println(checkPalindromeLinear(input));
	}
	
	@Test
	public void data4() {
		String input="12321";
		System.out.println(checkPalindromeBF(input));
		System.out.println(checkPalindromeTP(input));
		System.out.println(checkPalindromeLinear(input));
	}
	
	/* Pseudo Code - Brute Force - Two for loops
	 * 
	 * Two for loops
	 * Outer for loop - Incremental from 0 to length
	 * Inner for loop - Decremental from length to 0
	 * 		Check the characters in both i and j are equals
	 * 		Yes -> continue;
	 * 		No -> return false;
	 * 
	 * return true;
	 * 
	 * O(N2)
	 * O(1)
	 */
	
	/* Pseudo Code - Brute Force - StringBuffer
	 * 
	 * Reverse the input string using stringBuffer
	 * Check the input and reversed string 
	 * 		If it matches -> return true
	 * 		else -> false
	 *
	 *
	 *Time - O(N)
	 * Space - O(1) 
	 */
	
	public boolean checkPalindromeBF(String input) {
		
		if(input.length()== 0) return false;
		
		if(input.length()== 1) return true;
		
		StringBuffer sb=new StringBuffer(input);
		sb.reverse();
		if(sb.toString().equals(input)) {
			return true;
		}
		
		return false;
	}
	
	/* Pseudo Code - Two Pointer approach
	 * 
	 * Declare left=0 and right=lengh-1
	 * 
	 * Using while loop - left<right
	 * 	check if char[left] equals char[right]
	 * 		left++ and right--
	 * 	Else return false;
	 * 
	 * Time - O(N/2)
	 * Space - O(1)
	 * 
	 */
	public boolean checkPalindromeTP(String input) {
		
		if(input.length()== 0) return false;
		
		if(input.length()== 1) return true;
		
		int left=0; int right=input.length()-1;
		
		while(left<right) {
			if(input.charAt(left) == input.charAt(right)) {
				left++;right--;
				continue;
			}else {return false;}
		}
		
		return true;
	}
	/* Pseudo Code - Linear approach
	 * 
	 * Declare an empty string ""
	 * 
	 * Break the input to characters
	 * 
	 * Using for loop decremental
	 * 		Adding the characters to String
	 * 
	 * check input.equals(tempStr)
	 * 
	 * Time - O(N)
	 * Space - O(1)
	 * 
	 */
	
	public boolean checkPalindromeLinear(String input) {
		
		if(input.length()== 0) return false;
		
		if(input.length()== 1) return true;
		
		String temp="";
		
		for (int i = input.length()-1; i >= 0 ; i--) {
			temp=temp+input.charAt(i);
		}
		
		return temp.equals(input);
	}
}
