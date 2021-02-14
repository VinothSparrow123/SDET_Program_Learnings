package ProblemsSolved;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SortBasedAnotherString {

	/*
	 * Sort based on another String
		Given one string ('abbceeeg') sort it based on another string ('egbca')
		Result will be: 'eeegbbca'
		Do it less O[N2] => O[nlogn] => O[N]
		String s1 ="abbceeeg";
		String s2 = "egbca";
		Lowercase Alphabets
		No built sort functions !!
	 */

	@Test
	public void data1() {
		String input1="abbceeeg";
		String input2="egbca";
		System.out.println(sortBasedAnotherString(input1,input2));
	}

	@Test
	public void data2() {
		String input1="abcd";
		String input2="abcd";
		System.out.println(sortBasedAnotherString(input1,input2));
	}

	@Test
	public void data3() {
		String input1="abbceeegf";
		String input2="egbcafh";
		System.out.println(sortBasedAnotherString(input1,input2));
	}

	@Test
	public void data4() {
		String input1="";
		String input2="egbcafh";
		System.out.println(sortBasedAnotherString(input1,input2));
	}

	/*Pseudo Code
	 * 
	 * Divide the input1 and add into the map with an occurance
	 * Iterate the input2 characters Using foreach loop
	 * 		if the key matches, add the element into the new list based on the value from map
	 * 		If not return exception
	 * 
	 */

	private String sortBasedAnotherString(String input1, String input2) {

		String output="";

		Map<Character,Integer> map=new HashMap<>();

		for(int i=0;i<input1.length();i++)
			map.put(input1.charAt(i), map.getOrDefault(input1.charAt(i), 0)+1);


		for(Character c : input2.toCharArray()){
			if(map.containsKey(c)) {
				int value = map.get(c);
				while(value>0){
					output=output+c;
					value--;
				}
			}else {return "Invalid Input";}
		}
		return output;
	}

}
