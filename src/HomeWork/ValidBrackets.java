package HomeWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class ValidBrackets {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', 
	 * '[' and ']', determine if the input string is valid.
	 */
	
	/* Pseudo Code
	 * 
	 * Add the brackets in Map - closed one as key and open one as value
	 * create an empty stack and check whether it is available as a value in the map...
	 * 		If yes -> Add it into the Stack
	 * 		If No -> return exception
	 * 
	 * At the end if stack remains empty, return true... else false;
	 * 
	 */
	
	@Test
	public void data1() {
		String input="{()}";
		System.out.println(isValidBracket(input));
	}

	private boolean isValidBracket(String input) {
		
		Stack<Character> stack=new Stack<>();
		
		Map<String,String> map=new HashMap<>();
		map.put("}", "{");
		map.put(")", "(");
		map.put("]", "[");
		
		for (int i = 0; i < input.length(); i++) {
			if(map.containsValue(input.charAt(i))) {
				stack.push(input.charAt(i));
			}if(map.containsKey(input.charAt(i))) {
				stack.pop();
			}else return false;
		}
		
		if(stack.empty()) return true;
		
		return false;
		
	}
	
	//Babu's solution:
	
	private boolean validate(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
	
}
