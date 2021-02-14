import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class solvePranthesis {
	
	
	@Test
	public void data1() {
		String charac="(){[]}{}";
		System.out.println(isValidParan(charac));
	}
	@Test
	public void data2() {
		String charac="()[]}{}";
		System.out.println(isValidParan(charac));
	}
	
	@Test
	public void data3() {
		String charac="";
		System.out.println(isValidParan(charac));
	}
	
	private boolean isValid(String charac) {
		
		
		
		Map<Character,Character> map=new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		
		Stack<Character> stackk=new Stack<>();
		
		for(Character c:charac.toCharArray()) {
			char ele=stackk.isEmpty() ? ' ':stackk.pop();
			if(ele !=map.get(c)){
					return false;
			}else {stackk.push(c);}
			
		}
		
		return stackk.isEmpty();
		
	}
	

	public boolean isValidParan(String str) {
		char[] charArr=str.toCharArray();
		
		Map<Character,Character> map=new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		
		Stack<Character> stackk=new Stack<>();
		
		for(Character ch:charArr) {
			if(map.containsKey(ch)) {
				if(stackk.pop() !=map.get(ch)) {
					return false;
				}
			}
			else if(map.values().contains(ch)){
				stackk.push(ch);
			}
			
		}
		return stackk.isEmpty();
	}
}
