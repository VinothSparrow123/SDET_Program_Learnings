package ProblemsSolved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParanthesis {
	
	@Test
	public void example1() {
		String brackets = "()";
		Assert.assertEquals(true, isBracketsValid(brackets));
	}

	@Test
	public void example2() {
		String brackets = "()[]{}<>";
		Assert.assertEquals(true, isBracketsValid(brackets));
	}

	@Test
	public void example3() {
		String brackets = "(]";
		Assert.assertEquals(false, isBracketsValid(brackets));
	}

	@Test
	public void example4() {
		String brackets = "([)]";
		Assert.assertEquals(false, isBracketsValid(brackets));
	}

	@Test
	public void example5() {
		String brackets = "{[<>]}";
		Assert.assertEquals(true, isBracketsValid(brackets));
	}

	private boolean isBracketsValid(String brackets) {
		Stack<Character> stack = new Stack<Character>();
		for (char ch : brackets.toCharArray()) {
			if (stack.isEmpty() || isOpen(ch))
				stack.add(ch);
			else if (isClosed(ch) && isPair("" + stack.peek() + ch))
				stack.pop();
			else
				return false;
		}

		return stack.isEmpty();
	}

	private boolean isOpen(char open) {
		Set<Character> set = new HashSet<Character>() {
			{
				add('{');
				add('[');
				add('<');
				add('(');
			}
		};

		return set.contains(open);
	}

	private boolean isClosed(char closed) {
		Set<Character> set = new HashSet<Character>() {
			{
				add('}');
				add(']');
				add('>');
				add(')');
			}
		};

		return set.contains(closed);
	}

	private boolean isPair(String pair) {
		Set<String> set = new HashSet<String>() {
			{
				add("{}");
				add("[]");
				add("<>");
				add("()");
			}
		};

		return set.contains(pair);
	}
	
	public boolean isValid(String brackets) {
		
		if (brackets.length() ==0) {}
		
		Map<Character,Character> map=new HashMap<>();
		
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		
		
		for (Character ch : brackets.toCharArray()) {
			
		}
		
	}
}
