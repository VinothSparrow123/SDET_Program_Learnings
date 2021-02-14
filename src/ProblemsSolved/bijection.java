package ProblemsSolved;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class bijection {
	
	/*
	 * Given a pattern and a string s, find if s follows the same pattern.
		Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
		Example 1:
		Input: pattern = "abba", s = "dog cat cat dog"
		Output: true
		Example 2:
		Input: pattern = "abba", s = "dog cat cat fish"
		Output: false
		Input: pattern = "abc", s = "hello world world"
		Output: false
		Algorithm: HashMap 
	 */
	
	/* Pseudo Code
	 * Convert the pattern to char array and string to string array
	 * Iterate using for loop till the length of the pattern
	 * 	Inside the loop, try to add the key and value in a separate HashMap
	 * 	While adding verify map.containsKey
	 * 	
	 */

	
	@Test
	public void data1() {
		String pattern="abba";
		String sen="dog cat cat dog";
		System.out.println(getbiJection(pattern,sen));
	}
	
	@Test
	public void data2() {
		String pattern="abba";
		String sen="dog cat cat cat";
		System.out.println(getbiJection(pattern,sen));
	}
	
	@Test
	public void data3() {
		String pattern="abc";
		String sen="dog cat cat";
		System.out.println(getbiJection(pattern,sen));
	}
	
	@Test
	public void data4() {
		String pattern="aaa";
		String sen="dog cat cat cat";
		System.out.println(getbiJection(pattern,sen));
	}
	
	private boolean getbiJection(String pattern,String sen) {
		String[] inp=sen.split(" ");
		
		Map<Character,String> map=new HashMap<>();
		
		if(pattern.toCharArray().length!=inp.length) {
			return false;
		}
		
		
		for(int i=0;i<pattern.length();i++) {
						
			if(map.containsKey(pattern.charAt(i)) && (map.get(pattern.charAt(i)).equals(inp[i]))) {
				continue;
			}else if(map.containsKey(pattern.charAt(i)) && (!map.get(pattern.charAt(i)).equals(inp[i]))) {
				return false;
			}else {
				map.put(pattern.charAt(i), inp[i]);
			}
		}
		return true;
	}

}
