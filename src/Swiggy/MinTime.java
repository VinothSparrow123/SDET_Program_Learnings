package Swiggy;

import org.junit.Assert;
import org.junit.Test;

public class MinTime {
	/*
	 * Z -> A -> B -> C -> D -> E -> F -> G -> H -> I -> J -> K -> L -> M -> N -> O -> P -> Q -> R -> S -> T -> U -> V -> W -> X -> Y -> Z -> A
	 * It is a circular printer wheel with the letters A through Z in sequence. It wraps so A and Z are adjacent.
	 * The printer has a pointer that is initially at 'A'. Moving from any character takes 1 sec. It can move in either direction
	 * Given a string of letters, What is the min time needed to print the string.
	 * 
	 * "BZA" -> 1+2+1=4 sec.
	 * First move the pointer from A to B (1 sec), then from B to Z (2 sec) and finally from Z to A (1 sec).
	 */
	
	@Test
	public void example1() {
		String input = "BZA";
		System.out.println(minTime(input));
	}
	
	@Test
	public void example2() {
		String input = "AAAAA";
		System.out.println(minTime(input));
	}
	
	@Test
	public void example3() {
		String input = "AMAMAM";
		System.out.println(minTime(input));
	}
	
	@Test
	public void example4() {
		String input = "ZAZAZA";
		System.out.println(minTime(input));
	}
	
	public int minTime(String s) {
		int minTime = 0;
		char prev = 'A';
		
		for (int i = 0; i < s.length(); i++) {
			int min1 = Math.abs(prev - s.charAt(i));
			
			prev  = s.charAt(i);
			
			minTime = minTime + Math.min(min1, 26-min1);
			
		}
		
		return minTime;
	}
	
}
