package STack;

import java.util.Stack;

import org.junit.Test;

public class AdjacentDups {
	
	@Test
	public void data1() {
		String input="abbbccabaaaaa";
		String ad=adjacentDups(input);
		System.out.println(ad);
	}
	
	/*
	 * Check whether stack is empty or not
	 * If not -> peek the 
	 */
	
	private String adjacentDups(String input) {
		
		Stack<Character> stack = new Stack<>();
		for (Character c : input.toCharArray()) {
			
			if(!stack.isEmpty() && stack.peek().equals(c)){
				stack.pop();
			}else{
				stack.push(c);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Character character : stack) {
			sb.append(character);
		}
		
		return sb.toString();
	}
	
}
