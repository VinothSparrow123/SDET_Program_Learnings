package ds.strings;

import java.util.Arrays;

import org.junit.Test;

public class reverseEachWord {
	
	/*
	 * 1) Given a string, you need to reverse the order of characters in each word
	 * within a sentence while still preserving whitespace and initial word order.
	 * 
	 * Input: "I am doing great" 
	 * Output: "I ma gniod taerg"
	 */	
	
	
	@Test
	public void data1(){
	    String sentense = "World is too small";
	    StringBuilder reversedSen=reverseEachBeforeSpaceWithSB(sentense);
	    System.out.println(reversedSen);
	}
	
	@Test
	public void data2(){
	    String sentense = "World is too small";
	    System.out.println(reverseEachBeforeSpaceWith2Pointer(sentense));
	}
	
	@Test
	public void data3(){
	    String sentense = "World is too small";
	    System.out.println(reverseEachBeforeSpaceWithBF(sentense));
	}
	
	/*Approach1
	1. Split sentense into words using space
	2. Use string builder to reverse the each words
	3. And append the reversed strings into a StringBuilder 
	
	*/
	public StringBuilder reverseEachBeforeSpaceWithSB(String sentense) {
		
		String words[]=sentense.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for (String indivWords : words) {
			sb.append(new StringBuilder(indivWords).reverse().toString()+" ");
		}
		
		return sb;
		
		
	}
	
	/*Approach 2
	 * 
	 * 1. Split the given sentense into words
	 * 2. Iterate using foreach -> Swap the right and left values using two pointer algorithm
	 * 3. Concatenate the output of each reversed word with reversed sentense
	 */
	
	
	public String reverseEachBeforeSpaceWith2Pointer(String sentense) {
		
		String words[]=sentense.split(" ");
		String reversed="";
		
		for(String indivWords:words) {
			char[] indivChar=indivWords.toCharArray();
			int left=0;
			int right=indivChar.length-1;
			while(left<right) {
				char temp=indivChar[left];
				indivChar[left++]=indivChar[right];
				indivChar[right--]=temp;
			}
			reversed=reversed+Arrays.toString(indivChar)+" ";
		}
		
		return reversed;
		
		
	}
	/*Approach 3:
	 * Using two for loops
	 * 
	 */
	
	
	public String reverseEachBeforeSpaceWithBF(String sentense) {
		
		String words[]=sentense.split(" ");
		String reversed="";
		
		for(String indivWords:words) {
			String revWord="";
			for (int i =indivWords.length()-1; i >= 0; i--) {
				revWord=revWord+indivWords.charAt(i);
			}
			reversed=reversed+revWord+" ";
		}
		
		return reversed.trim();
		
		
	}
	
	
}
