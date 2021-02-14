package ds.arrays;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MaximumSubString {
	/*
	 * Given a string s that consists of only upper case letters, you can perform at 
		most k operations on that string.
		In one operation, you can choose any character of the string and change it to any other upper 
		case character.
		Find the length of the longest sub-string containing all repeating letters you can get after 
		performing the above operations.
		Example 1:
		Input:
		s = "ABAB", k = 2
		Output:
		4
		Explanation:
		Replace the two 'A's with two 'B's or vice versa.
		Example 2:
		Input:
		s = "AABABBA", k = 1
		Output:
		4
		Explanation:
		Replace the one 'A' in the middle with 'B' and form "AABBBBA".
		The substring "BBBB" has the longest repeating letters, which is 4.
	 */
	
	@Test
	public void data1(){
		String s= "ABAB";
		int k = 4;
		System.out.println(largestSubArray(s,k));
	}
	
	@Test
	public void data2(){
		String s= "AABABBA";
		int k = 1;
		System.out.println(largestSubArray(s,k));
	}
	
	@Test
	public void data3(){
		String s= "";
		int k = 4;
		System.out.println(largestSubArray(s,k));
	}


	@Test
	public void data4(){
		String s= "AAAAAAAAA";
		int k = 4;
		System.out.println(largestSubArray(s,k));
	}
	
	@Test
	public void data5(){
		String s= "AAAAAAAAA";
		int k = 16;
		System.out.println(largestSubArray(s,k));
	}
	
	
	private int largestSubArray(String s, int k) {
		
		if(s.length() < k || s.length() < 2) return s.length();
		
		int max=Integer.MIN_VALUE;
		int left=0;int right=left+1;
		
		Set<Character> set=new HashSet<>();
		
		char[] input=s.toCharArray();
		
		while(left<s.length()) {
			set.add(input[left]);
			int temp=k;
			while(right<input.length) {
				if(set.add(input[right])) {
					temp--;
				}
				right++;
				if(temp==0 ||(right>=input.length-1)) {
					break;
				}
			}
			max=Math.max(max,right-left+1);
			left++;
		}
		
		return max;
	}

}
