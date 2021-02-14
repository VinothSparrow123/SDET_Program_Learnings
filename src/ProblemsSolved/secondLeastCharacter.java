package ProblemsSolved;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;


public class secondLeastCharacter {

	/*
	 * Find the second least character in a given string
		  Example:
		  Input: "tesla-service" Output: s 
		     a) If there are more than one match, return the last match "aabbccc" -> 'b'
		     b) If there are no second match, return ' '
		     
		     axxyybbbbccccc
	 */

	/*Pseudo Code
	 * 
	 * Convert the input string to characters and store it in a HashMap with an occurance
	 * sort the map
	 * And get the key value
	 * 
	 * 
	 */

	@Test
	public void data1() {
		String input="tesla-service";
		getSecondLeastCharacter(input);
	}

	@Test
	public void data2() {
		String input="tesssla-service";
		getSecondLeastCharacter(input);
	}
	
	@Test
	public void data3() {
		String input="tessssla-service";
		getSecondLeastCharacter(input);
	}

	private char getSecondLeastCharacter(String input) {

		Map<Character,Integer> map1=new LinkedHashMap<>();

		for(int i=0;i<input.length();i++) {
			map1.put(input.charAt(i), map1.getOrDefault(input.charAt(i), 0)+1);
		}

		char output=' ';
		Set<Integer> distinct=new HashSet<>(map1.values());

		if(distinct.size()!=1) {
			List<Integer> distinctlist=new ArrayList<>(distinct);
//			Collections.sort(distinctlist);
			int secondLeas=distinctlist.get(1);
			System.out.println(input.charAt(secondLeas));
			for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
				if(entry.getValue()==secondLeas) {
					output=entry.getKey();
				}
			}
		}
		return output;
	}
}
