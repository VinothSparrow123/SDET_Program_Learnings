package ProblemsSolved;

import org.junit.Test;

public class windowSliding_maxSubstring {
	
	/*
	 * P 4) Given a string s that consists of only uppercase letters, you can perform at most k operations on that string.
		In one operation, you can choose any character of the string and change it to any other uppercase character.
		Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.
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
	 * 
	 */
	
	/*
     * Pseudo-code:
     * Convert string to charArray
     * Using window sliding - take two pointers start from left (left,right)
     * Slide through the array (for/while) <str.length
     * if left value = right value
     * if yes - right++
     * if no - count++ (Count should not exceed given k)
     * if (count > k)  and (rightvalue = leftvalue) right++
     * else left++;
     */
    
    @Test
    public void dataSet1() {
        String str = "ABABBB";
        int k=2;
        getMaxCount(str, k);
    }
    
    public void getMaxCount(String str, int k) {
        int left=0, right=1;
        int count=0;
        int maxCount=0;
        char[] ch = str.toCharArray();
        for(int i=left; i<str.length(); i++) {
            if(ch[left] == ch[right]) {
                right++;
            }
            else {count++; right++;}
            if(count>k) {
                if(ch[left] == ch[right]) right++;
                else { left++; right=left+1;}
            }
            maxCount = Math.max(maxCount, right-left);
        }
        System.out.println(maxCount);
    }

}
