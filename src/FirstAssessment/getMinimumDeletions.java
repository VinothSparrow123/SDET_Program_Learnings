package FirstAssessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class getMinimumDeletions {
	/*
	 * Given a string, reduce it in such a way that all of its substrings are
		distinct. To do so, you may delete any characters at any index. What is
		the minimum number of deletions needed?		
	 */
	
//	@Test
//	public void data1() {
//		String input="abab";
//		System.out.println(getMinDeletions(input));
////		System.out.println(getMinDeletions_set(input));
////		System.out.println(getMinDeletions_set2(input));
//	}
//	
//	@Test
//	public void data2() {
//		String input="aaaaa";
//		System.out.println(getMinDeletions(input));
//	}
	@Test
	public void data3() {
		String input="abcabccc";
		System.out.println(getMinDeletions(input));
		System.out.println(getMinDeletions_set(input));
		System.out.println(getMinDeletions_set2(input));
	}
	
	
	/*Approach1
	 * Convert the string into the character array and convert the same into list
	 * If there are repeating characters remove it from the list
	 * 
	 */
	
	private int getMinDeletions(String input) {
		char[] inputChars=input.toCharArray();
		List<Character> charList=new ArrayList<>();
		for(Character c:inputChars) {
			charList.add(c);
		}
		int minDeleteCount=0;
		int left=0;int right=input.length()-1;
		
		
		while(left<right) {
			while(inputChars[left]!=inputChars[right]) {
				right--;
			}
			
			if(inputChars[left]==inputChars[right]) {
				left++;
				minDeleteCount++;
				right=input.length()-1;
			}
			
		}
		
		return minDeleteCount;
	}
	
	/*
	 * Convert the string into the character array and convert the same into Set
	 * As set wont allow the duplicate values
	 */
	private int getMinDeletions_set(String input) {
		int mindelcount=0;
		char[] inputChars=input.toCharArray();
		Set<Character> set=new HashSet<>();
		for(Character c:inputChars) {
			if(set.contains(c)) {
				mindelcount++;
			}else {set.add(c);}
		}
		System.out.println(set.toString());
		
		return mindelcount;
	}
	
	private int getMinDeletions_set2(String input) {
		char[] inputChars=input.toCharArray();
		Set<Character> set=new HashSet<>();
		for(Character c:inputChars) {
			set.add(c);
		}
		System.out.println(set.toString());
		int mindelcount=inputChars.length-set.size();
		return mindelcount;
	}
	
}
