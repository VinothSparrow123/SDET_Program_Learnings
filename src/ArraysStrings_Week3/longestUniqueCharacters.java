package ArraysStrings_Week3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class longestUniqueCharacters {
	
	@Test
	public void data1() {
		String input="bananas";
		System.out.println(findUniqueCharacs(input));
	}
	
	@Test
	public void data2() {
		String input="!@#$%^%$#@!7890";
		System.out.println(findUniqueCharacs(input));
//		findUniqueCharacs(input);
	}
	
	@Test
	public void data3() {
		String input="1234543290";
		System.out.println(findUniqueCharacs(input));
//		findUniqueCharacs(input);
	}
	
	@Test
	public void data4() {
		String input="vinothkumar";
		System.out.println(findUniqueCharacs(input));
//		findUniqueCharacs(input);
	}
	
	private int findUniqueCharacs(String input) {
		
		int max=0;
		List<Character> list=new ArrayList<>();
		
		for (Character c:input.toCharArray()) {
			if(list.contains(c)) {
				max=Math.max(max, list.size());
				list.clear();
			}else {
				list.add(c);
			}
			max=Math.max(max, list.size());
		}
		return max;
		
	}
}
