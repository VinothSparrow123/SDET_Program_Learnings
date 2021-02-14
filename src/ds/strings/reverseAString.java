
package ds.strings;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;


public class reverseAString {
	
	@Test
	public void test1() {
		String input="vinothkumar";
		reverseString(input);
	}
	
	public void reverseString(String input) {
		StringBuilder sb=new StringBuilder();
		
		sb.append(input);
		
		System.out.println(sb.reverse());
	}
	
	public void reverseStringUsing2Pointer(String input) {
		char[] charArray = input.toCharArray();
		int left =0 ;
		int right = charArray.length-1;
		while(left<right){
			char temp = charArray[left];
			charArray[left++]=charArray[right];
			charArray[right--]=temp;
		}
		System.out.println(Arrays.toString(charArray));
    }

}