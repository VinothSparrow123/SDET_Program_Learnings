package FirstAssessment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class shortestSubstring {
	/*
	 * Given a string comprised of lowercase letters in the range ascii[a-z],
		find the length shortest substring that contains at least one of each of
		the letters in the string.
	 */
	
	@Test
	public void data1() {
		String input="abcdabcde";
		System.out.println(getShortestSubstringlength(input));
	}
	
	/*
	 * Approach1
	 * Get the unique letters from the given string
	 * Add it in the Hashset
	 * Then split the possible substring from the input
	 * check whether all the letters available in the set is matching with the substring being iterated
	 */
	
	
	public int getShortestSubstringlength(String input) {
		Set<Character> set=new HashSet<Character>();
		for (Character character : input.toCharArray()) {
			set.add(character);
		}
		
		List<String> substring=new ArrayList<String>();
		
		for (int i = 0; i < input.length()-set.size()+2; i++) {
			substring.add((input.substring(i,i+set.size()-1)));
		}
		
		System.out.println(substring);
		
		for (int j = 0; j < substring.size(); j++) {
			if(substring.get(j).matches(set.toString().replaceAll(", ",""))) {
				
			}else {
				substring.remove(substring.get(j));
			}
		}
		
		return substring.size();
	}
	
}
