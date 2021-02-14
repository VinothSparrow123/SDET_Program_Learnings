package ProblemsSolved;

import org.junit.Test;

public class BiggestASCIILetter {
	
	/*
	 * Given a string S with both lowercase and uppercase letters, return the biggest ASCII letter that appears 
	 * both in lowercase and uppercase. The returned letter must be in uppercase. If there is no such letter, 
	 * return 'NO'.
		Examples:
		'aaabcAbCdD', return 'D'
		'aA', return 'A'
		'abcdE', return 'NO'
		'a', return 'NO'
	 */
	
	@Test
	public void data1() {
		String input="fFaaabcAbCdD";
		System.out.println(getBiggestASCII(input));
	}

	/*Pseudo Code
	 * 
	 * Split the input string to characters
	 * 
	 * 
	 * 
	 */
	

	private String getBiggestASCII(String input) {
		
		if(input.length()==1) return "NO";
		
		boolean[] upper=new boolean[26];
		boolean[] lower=new boolean[26];
		
		for(int i=0;i<input.length();i++) {
			if(Character.isLowerCase(input.charAt(i))) {
				lower[input.charAt(i)-'a'] = true;
			}
			if(Character.isUpperCase(input.charAt(i))) {
				upper[input.charAt(i)-'A'] = true;
			}
		}
		
		for (int i = 25; i <= 0; i--) {
			if(upper[i] && lower[i])
				return (char)(i+'A') + "";
		}
		
		return "NO";		
	}
	

}
