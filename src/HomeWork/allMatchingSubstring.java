package HomeWork;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class allMatchingSubstring {

	/*
	 * Given 2 input strings, return the minimum window in the first string which will contain all the characters in second string.

		Input: str1 = "KSTRKSE", str2 = "KST"
		Output: "KST"
		
		Input: str1 = "KASRTRKSE", str2 = "ST"
		Output: "SRT"
		
		Algorithm: Sliding Window
		
		Explanation: There are 2 matches "SRT" and "TRKS" and out of this first one is shorter window
	 */
	
	/*
	 * Convert the string1,String2 into char[]
	 * Add string2 char[] into a list
	 * Using for loop iterate the string1 and find which element is available in list
	 * when we find the first element, , try to identify other elements as well untill the list becomes empty
	 * When it becomes empty get the i and j
	 */
	
	@Test
	public void data1() {
		String inp1="KSTRKSE";
		String inp2="KST";
		getMatchingSubstring(inp1,inp2);
	}
	
	private String getMatchingSubstring(String inp1,String inp2) {
		
		int start=0;int end=inp2.length();
		
		
		char[] ch1=inp1.toCharArray();
		char[] ch2=inp2.toCharArray();
		
		List ls1=Arrays.asList(ch2);
		
		
		for(int i=inp2.length();i<ch1.length;i++) {
			if(ls1.contains(ch1[i])) {
				ls1.remove(ch1[i]);
			}
		}
		
		String substr=inp1.substring(start,end);
		return substr;
	}
}
