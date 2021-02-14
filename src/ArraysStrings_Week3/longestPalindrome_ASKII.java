package ArraysStrings_Week3;

import org.junit.Test;

public class longestPalindrome_ASKII {
	
	@Test
	public void data1() {
		String input="bananas";
		System.out.println(solution1(input));
	}
	
	@Test
	public void data2() {
		String input="!@#$%^%$#@!7890";
		System.out.println(solution1(input));
	}
	
	@Test
	public void data3() {
		String input="1234543290";
		System.out.println(solution1(input));
	}
	
	@Test
	public void data4() {
		String input="vinothkumar";
		System.out.println(solution1(input));
	}
	
	private int solution1(String input) {
		
		int[] count=new int[256];
		for(char c:input.toCharArray()) {
			count[c]++;
		}
		
		int result=0;
		int j=0;
		
		for(int i:count) {
			result += i/2*2;
			if(result %2==0 && i%2 ==1) {
				result++;
			}
			
			System.out.println((char)j++);
			System.out.println("************************");
		}
		return result;
	}

}
