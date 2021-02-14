package ArraysStrings_Week3;

import java.util.HashMap;

import org.junit.Test;

public class SecondLeastRepNumber {
	
	/*
	 * Find the second least repeating number in a given String
		input: paypal
	 */
	
	@Test
	public void data1() {
		String input="paypal";
		HashMap<Character, Integer> repeatingCharacs=secondLeastRep(input);
		System.out.println(repeatingCharacs);
	}
	
	@Test
	public void data2() {
		String input="p";
		HashMap<Character, Integer> repeatingCharacs=secondLeastRep(input);
		System.out.println(repeatingCharacs);
	}
	
	@Test
	public void data3() {
		String input="";
		HashMap<Character, Integer> repeatingCharacs=secondLeastRep(input);
		System.out.println(repeatingCharacs);
	}
	
	@Test
	public void data4() {
		String input="accentureee";
		HashMap<Character, Integer> repeatingCharacs=secondLeastRep(input);
		System.out.println(repeatingCharacs);
	}
	
	/*Approach:
	 * Convert the input string to character array
	 * compare the first character with rest of the character in array using loop
	 * pick the characters which is not repeating and add it to HashMap
	 * get the second character from the map
	 */
	
	/*
	 * private HashMap<Character,Integer> secondLeastRep(String input) {
	 * 
	 * char[] inpChar=input.toCharArray(); HashMap<Character, Integer>
	 * repeatingCount=new HashMap<>(); for(int i=0;i<inpChar.length-1;i++) { int
	 * count=1; for(int j=i+1;j<inpChar.length;j++) { if(inpChar[i]==inpChar[j]) {
	 * System.out.println("Repeating characters are: "+inpChar[i]); count++;
	 * 
	 * } } repeatingCount.put(inpChar[i], count); }
	 * 
	 * return repeatingCount; }
	 */
	private HashMap<Character,Integer> secondLeastRep(String input) {
		
		if(input.length()<1) {
			System.out.println("Invalid input");
		}
		
		char[] inpChar=input.toCharArray();
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(Character ch:inpChar)
			map.put(ch, map.getOrDefault(ch, 0)+1);
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}else {
//				map.put(ch,1);
//			}
		return map;
		
	}
	
}
