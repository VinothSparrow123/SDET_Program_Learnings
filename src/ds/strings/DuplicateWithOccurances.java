package ds.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class DuplicateWithOccurances {
	/* Given a string return the duplicates with occurrences*/
	
	@Test
	public void data1() {
		String s="banana";
//		System.out.println(getDuplicateOccurance(s));
		getDuplicateOccurance(s);
	}
	
	@Test
	public void data2() {
		String s="Google";
//		System.out.println(getDuplicateOccurance(s));
		getDuplicateOccurance(s);
	}

	private void getDuplicateOccurance(String s) {
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(Character ch:s.toLowerCase().toCharArray())
			map.put(ch, map.getOrDefault(ch, 0)+1);
		
//		System.out.println(map.equals(map));
		for(Map.Entry<Character,Integer> eachEntry:map.entrySet())
			if(eachEntry.getValue() >1)
				System.out.println(eachEntry.getKey()+" = "+eachEntry.getValue());
	}	
}
