package ProblemsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ReverseTheString_UsingRecursion {
	
	/*Microsoft Question Given an input of String, 
	 * reverse the order of the words 
	 * 
	 * Example 1:  Input: “ the sky is blue ” 
	 * Output: “blue is sky the” 
	 * Note: Remove the trailing or leading white spaces. 
	 * Constraints: // Mandatory approach: Solve it with recursion 
	 * // + 2 approach  // StringBuffer Time: 30 Minutes !!
	 * 
	 */
	
	@Test
	public void data1() {
		String input="the sky is blue";
		System.out.println(getReversedString(input));
		System.out.println(getReversedString_Recursion(input));
		
	}
	
	/* Pseudo Code - decremental For loop
	 * 
	 * Break the string into string array using space
	 * declare variable: reversed
	 * 
	 * Using for loop
	 * 	reversed=reversed+" "+string[i]
	 * 
	 * return reversed;
	 */

	private String getReversedString(String input) {
		
		if(input.length()<2) {return input;}
		
		String reversed="";
		String removespl = input.replaceAll("\\W+", " ").toLowerCase().trim();
		String[] strArr=removespl.split(" ");
		for (int i = strArr.length-1; i >= 0; i--) {
			
			reversed=reversed+strArr[i]+" ";
		}
		
		
		return reversed;
	}
	
	/* Pseudo Code - Recursion
	 * 
	 * Declare variable reversed;
	 * 
	 *  create a recursive function - Parameter - String[], index
	 *  	if(index<0) -> break
	 *  	reversed=reversed + " " +String[index]
	 *  	call recursive function by decrementing the index 
	 * 
	 */
	
	private String getReversedString_Recursion(String input) {
		
		if(input.length()<2) {return input;}
		
		String reversed="";
		String removespl = input.replaceAll("\\W+", " ").toLowerCase().trim();
		String[] strArr=removespl.split(" ");
		reversed= recursiveFunction(strArr,strArr.length-1,reversed);
		
		return reversed.trim();
	}

	private String recursiveFunction(String[] strArr, int i,String reversed) {
		if(i < 0) return reversed;
		
		reversed=reversed+" "+strArr[i];
		return recursiveFunction(strArr,i-1,reversed);
	}
	
	/* Pseudo Code - Two Pointer
	 * 
	 * Convert the string to string[]
	 * declare variable: left=0;right=length-1
	 * while(left<right)
	 * 
	 * String temp=string[left];
	 * Swap the right and left values
	 * assign temp to right
	 * 
	 * return string[].toString()
	 */

}
