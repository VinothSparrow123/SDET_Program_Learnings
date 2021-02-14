package ds.strings;

import org.junit.Test;

public class encodedToDecoded {
	
	/*
	 * 2) Given an encoded string, return its decoded string.

			Input: s = "3[a]2[bc]"
			Output: "aaabcbc"
			
			Input: s = "3[a2[c]]"
			Output: "accaccacc"
	 */
	
	@Test
	public void data1(){
	    String encoded = "3[a]2[bc]";
	    String decoded=decryptTheString(encoded);
	    System.out.println(decoded);
	}
	
	@Test
	public void data2(){
	    String encoded = "3[a6[c]d]2[x]";
	    String decoded=decryptTheString(encoded);
	    System.out.println(decoded);
	}
	
	/*Approach 1
	 * 1. 
	 * 
	 */
	
	public String decryptTheString1(String encoded) {
		
		String decodedString="";
		
		
		
		
		return decodedString;
	}
	public String decryptTheString(String encoded) {
	
		encoded = encoded.replaceAll("\\W", "");  //3a2bc
		String op = "";
	
		int toIndex = encoded.length();
		for (int i = encoded.length() - 1; i >= 0; i--) {
			String output = "";
	
			if (Character.isDigit(encoded.charAt(i))) {
				int repeat = 0;
				int repeatTill = Integer.parseInt(String.valueOf(encoded.charAt(i))); //2,3
	
				while (repeat < repeatTill) {
					output += encoded.substring(i + 1, toIndex); // output = ouput +t inputStr.substring(i + 1);
					repeat++;
					
				}
				toIndex = i;
			}
			op = output + op;
		}
	
		return op.replaceAll("\\d", "");
	
	}

}
