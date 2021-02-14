package ds.strings;

import java.util.ArrayList;

import org.junit.Test;

public class nonRepeatedAdjacentChars {
	
	
	
	/*
	 * 3) Given a string, check if the letters can be rearranged so that two characters that are adjacent to each other are not the same.
		
		Input: "aab"
		Output: "aba"
		
		Input: "aaab"
		Output: ""
	 */
	
	@Test
	public void data1(){
	    String input = "abba";
	    String rearranged=nonRepeatedAdjacentLetters(input);
	    System.out.println(rearranged);
	}
	
	private String nonRepeatedAdjacentLetters(String input) {
		String output = "";

		// covert string to List
		ArrayList<String> list = new ArrayList<String>();

		for (char c : input.toCharArray()) {
			list.add(c + "");
		}

		int charIndex = 0;
		int loopIndex = 0;

		output += list.remove(charIndex);
		while (list.size() != 0) {
//			System.out.println(output.charAt(charIndex) + " - " + list.get(loopIndex) + (!(output.charAt(charIndex) + "").equals(list.get(loopIndex))));
			if (!(output.charAt(charIndex) + "").equals(list.get(loopIndex))) {
				output += list.remove(loopIndex);
				loopIndex = 0;
				++charIndex;
				System.out.println(output);
				continue;
			}
			++loopIndex;
			if (loopIndex == list.size())
				return "";
		}

		return output;
	}

}
