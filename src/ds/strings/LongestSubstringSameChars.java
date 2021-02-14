package ds.strings;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class LongestSubstringSameChars {
	/*
	 * Amazon
	Given a String that has only Uppercase Characters, 
	    a) You are allowed to replace any character with any specific character
	    b) But only upto K given input
	Find the longest substring containing all same character !!
	Examples
	 Input: “AABAAB” , 2
	Output: “AAAAAA” -> 6
	Input: “ABCDE” , 1
	Output: “AACDE -> 2
	 */
	
	@Test
	public void data1() {
		String input="AABAAB";
		int k=2;
		maxsubstring_BF(input,k);
		maxcount_winsliding(input,k);
		maxoccurence(input,k);
	}
	
	/* Pseudo Code - Brute Force - Two for loops
	 * Variables: k and input string, maxLen
	 * 
	 * Outer Loop - from 0 to length-1 - i
	 * Inner loop - from i+1 to length-1 - j
	 * 		validate if value of index i and value of index j is equal
	 * 			If yes -> continue;
	 * 				No -> decrement k
	 * 
	 * 		If k value equal to zero or left value equal to length-2 
	 * 			Find the max substring length j-i and store it in maxLen 
	 * 			
	 * 
	 * Time - O(N2)
	 * Space - O(1)
	 */
	
	private int maxsubstring_BF(String s, int k){
        if(k>= s.length()) return s.length();
        int max=0, temp=k;
        
        //Outer for loop
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)!=ch){
                    temp--;
                }
                if(temp==0){
                    max=Math.max(max,j-i+1);
                    temp=k;
                    break;
                }
            }
        }
        
        return max;
        
    }
	
	
	/* Pseudo Code - Window Sliding
	 * 
	 * Break the string into characters
	 * 
	 * Parameters: left, right
	 * 
	 * Iterate using while loop - till left lesser than length of input
	 * 	
	 * validate if value of index i and value of index j is equal
	 * 			If yes -> continue;
	 * 				No -> decrement k
	 * 
	 * 		If k value equal to zero or left value equal to length-2 
	 * 			Find the max substring length j-i and store it in maxLen 
	 * 
	 * Time - O(N)
	 * Space - O(1)
	 */
	
	//Optimal Solution
	
	private int maxcount_winsliding(String s, int k) {
        int len =s.length();
        int max=0,maxlen=0,start=0;
        int [] count = new int[26];
        
        for(int end=0;end<len;end++) {
            max=Math.max(max, ++count[s.charAt(end)-'A']);
            while(end-start+1-max>k) {
                count[s.charAt(start)-'A']--;
                start++;
            }
            maxlen=Math.max(maxlen, end-start+1);
        }
        
        return maxlen;
    }
	
	/*
	   Pseudo Code: Using Window sliding
	   1. Declare variables start, end and occurence
	   2. Iterate through the string
	   3. get character at index and add to map
	   4. find hte occurence using Math.max (occurence, value from map)
	   5. check if index-start+1 - occurence > k, if so get character at start, increment start & decrement count in map
	   6. find max using math.max(max, end-start+1)
	   TC: O[N]
	   SC: O[1]
	*/

	
	private int maxoccurence(String s, int k){
	        int start=0,max=0, occurence=0;
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        
	        for(int i=0;i<s.length();i++){
	            char ch= s.charAt(i); // AABCBB
	            map.put(ch,map.getOrDefault(ch,0)+1); //B=3 C=1
	            occurence = Math.max(occurence,map.get(ch)); //3
	            
	            if(i-start+1-occurence>k){ // 5-0+1-3 >2
	                char ch1= s.charAt(start);
	                map.put(ch1,map.getOrDefault(ch1,0)-1);
	                start++; //2
	            }
	            max=Math.max(max,i-start+1); //4
	        }
	        
	        return max;
	}
	
	//Different approach
	
	public int getMaxLength(String s, int k) {
        int len = s.length();
        int[] count = new int[128];
        int start = 0, maxCount = 0, maxLength = 0;
        for (int end = 0; end < len; end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end)]);
            if(maxCount + k <= end - start) {
                count[s.charAt(start++)]--;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
