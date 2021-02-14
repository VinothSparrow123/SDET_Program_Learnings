package ds.recursion;

import org.junit.Test;

public class ReverseString {
	
	/* Reverse a given string
	 * 
	 */
	
	@Test
	public void data1() {
		String input="vinothkumar";
		reverseString(input);
	}
	
	private String reverseString(String input) {
		String s="";
		if(input.length()==0)
			return input;
		s = s +input.charAt(input.length()-1);
		reverseString(input.substring(0,input.length()-1));
		
		return s;
	}
}
