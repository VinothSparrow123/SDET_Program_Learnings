package ProblemsSolved;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.junit.Test;

public class lengthOFLongestSubString {
	
	/*
	 * Longest substring T that contains at most k distinct characters
	 * 
	 * Example1:
	 * input: s=eceba, k=2
	 * Output: 3
	 * Explanation: T is 'ece' which its length is 3
	 */
	
	@Test
	public void data1() {
		String s="exeba";
		int k=2;
		System.out.println(getLongestSubstring(s,k));
	}
	
	@Test
	public void data2() {
		String s="ecebaaaaee";
		int k=2;
		System.out.println(getLongestSubstring(s,k));
	}
	
	@Test
	public void data3() {
		String s="ecebaaaaee";
		int k=0;
		System.out.println(getLongestSubstring(s,k));
	}
	
	@Test
	public void data4() {
		String s="zzyyzzxyyzz";
		int k=5;
		System.out.println(getLongestSubstring(s,k));
	}

	
	/*Pseudo Code
	 * 
	 * 1. Split the string into character array
	 * 2. Initialize one set
	 * 3. Using Sliding window navigate from left with variables (left, right and k value)
	 * 		In each navigation add the element into set and ensure that set is not containing more than k unique characters
	 * 		If it exceeds k, store the list size to maxSSLength
	 * 
	 */
	
	public int getLongestSubstring(String s,int k) {
		int maxSSLength=0;
		int left=0;int right=0;
		
		List<Character> list=new ArrayList<>();
//		Set<Character> set=new LinkedHashSet<>();
		
		while(right<s.length()) {
			list.add(s.charAt(right));
			right++;
			if((new HashSet<Character>(list).size())>k) {
				list.remove(0);
				left++; //need to check why we are incrementing left
			}
			maxSSLength=Math.max(maxSSLength, right-left);
		}	
		return maxSSLength;
	}
	
	//ASKII Approach
}
