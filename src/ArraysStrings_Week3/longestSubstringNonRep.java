package ArraysStrings_Week3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class longestSubstringNonRep {
	
	/*	Longest Substring Without Repeating Characters
		Input: s = "abcabcbb"
		Output: 3
		Explanation: The answer is "abc", with the length of 3.
		Input: s = "bbbbb"
		Output: 1
		Explanation: The answer is "b", with the length of 1.
		Input: s = "pwwkew"
		Output: 3
		Explanation: The answer is "wke", with the length of 3.
		Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 * 
	 */
	@Test
	public void data1() {
		String input="abbcabcbb";
		solution1(input);
	}
	
	@Test
	public void data() {
		String input="abbcabcbbabcdef";
		solution1(input);
	}
	
	private void solution1(String input){
		int max=0;
		
		List<Character> list=new ArrayList<>();
		
		for(Character c:input.toCharArray()) {
			if(list.contains(c)) {
				max=Math.max(max, list.size());
				list.clear();
			}
			list.add(c);
			max=Math.max(max, list.size());
		}
		System.out.println(max);
	}

	
//    private void solution1(String input){
//        char[] inpChar=input.toCharArray();
//        int[] inpArr=new int[256];
//        int max = 0,count=1;
//        for (int i = 0; i < inpChar.length; i++) {
//            inpArr[input.charAt(i)]++;
//            count++;
//            max = Math.max(max, count);
//            if(inpArr[input.charAt(i)]>1 ){
//                inpArr[input.charAt(i)]=0;
//                count =1;
//            }
//            
//            
//        }
//        
//        System.out.println(max);
//    }


	
}