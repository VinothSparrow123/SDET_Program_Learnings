package ProblemsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MostCommonWord {
	
	/*	Test Data
	 * 
	 * 
	 */
	
	@Test
	public void data1() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(getMostCommonWord(paragraph,banned));
	}
	
	@Test
	public void data2() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {""};
		getMostCommonWord(paragraph,banned);
	}
	
	@Test
	public void data3() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"ant"};
		getMostCommonWord(paragraph,banned);
	}
	
	@Test
	public void data4() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit","ball"};
		getMostCommonWord(paragraph,banned);
	}

	
	/*Pseudo Code
	 * 
	 * Split the paragraph to String array
	 * Add it into the Map
	 * Remove the banned key from the map
	 * Add the remaining values into the List and get the max and return the respective key
	 *  
	 */
	

	private String getMostCommonWord(String paragraph, String[] banned) {
		
		String[] indivStr=paragraph.replaceAll("[,.]", "").toLowerCase().split(" ");
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for (String indiv : indivStr) {
			
			map.put(indiv, map.getOrDefault(indiv, 0)+1);
		}
		
		for (String string : banned) {
			map.remove(string);
		}
		List<Integer> list=new ArrayList<>(map.values());
		
		Collections.sort(list);
		
		int maxRepValue=list.get(list.size()-1);
		
		String maxRepStr="";
		
		for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
			if(eachEntry.getValue() == maxRepValue) {
				maxRepStr=eachEntry.getKey();
			}
		}
		
		return maxRepStr;
		
		//Have to convert all letters to lowercase
	}
}
