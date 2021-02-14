package ProblemsSolved;

import java.awt.im.InputContext;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MaxNumberInsert5 {

	/*
	 * Find the maximum possible value by inserting '5'
		Examples:
		input: 1234 -> output: 51234
		input: 7643 -> output 76543
		input: 0 -> output 50
		input: -661 -> output -5661
	 */

	@Test
	public void data1() {
		int input=1234;
		int k=5;
		System.out.println(getMaxPossValue(input));
	}

	@Test
	public void data2() {
		int input=7643;
		System.out.println(getMaxPossValue(input));
	}

	@Test
	public void data3() {
		int input=0;
		System.out.println(getMaxPossValue(input));
	}

	@Test
	public void data4() {
		int input=-2;
		System.out.println(getMaxPossValue(input));
	}

	/*Pseudo Code
	 * 
	 * Convert the number to String
	 * Check the first number smaller than 5
	 * 	If yes add this before the element and add the counter to not add another 5
	 * 		No - > add the element into list and try to check other elements through loop
	 * 
	 * Do it in reverse for -ve numbers
	 * 
	 */

	private String getMaxPossValue(int input) {

		int posCount =0;
		int negCount =0;
		String inputStr=Integer.toString(input);

		List<Character> list=new ArrayList<>();

		if(input<0) {
			for (int i = 0; i <inputStr.toCharArray().length ; i++) {
				if(inputStr.charAt(i) > '5' && negCount ==0) {
					list.add('5');
					negCount++;
				}
				list.add(inputStr.charAt(i));
			}
		}

		if(input>=0) {
			for (int i = 0; i <inputStr.toCharArray().length ; i++) {
				if(inputStr.charAt(i) < '5' && posCount ==0) {
					list.add('5');
					posCount++;
				}
				list.add(inputStr.charAt(i));
			}
		}

		return list.toString();
	}
}
