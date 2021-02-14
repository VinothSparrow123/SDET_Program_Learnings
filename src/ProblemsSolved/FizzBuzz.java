package ProblemsSolved;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class FizzBuzz {
	
	/*
	 * 1) Write a program that outputs the string representation of numbers from 1 to n.
			But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
			n = 15,
			Return:
			[
			    "1",
			    "2",
			    "Fizz",
			    "4",
			    "Buzz",
			    "Fizz",
			    "7",
			    "8",
			    "Fizz",
			    "Buzz",
			    "11",
			    "Fizz",
			    "13",
			    "14",
			    "FizzBuzz"
			]
	 */
	
	@Test
	public void data1() {
		int n=15;
		System.out.println(returnFizzBuzz(n));
	}
	
	@Test
	public void data2() {
		int n=-15;
		System.out.println(returnFizzBuzz(n));
	}
	
	@Test
	public void data3() {
		int n=3;
		System.out.println(returnFizzBuzz(n));
	}
	
	/*Pseudo Code
	 * 
	 * Declare a List
	 * Iterate through for/while loop
	 * 		If the num value %3 = 0 -> Add Fizz into the list
	 * 		if the num value %5 = 0 -> Add Buzz into the list
	 * 		if the num value %5 && %3 = 0 -> Add FizzBuzz into the list
	 * 		return the list finally
	 */
	
	private String returnFizzBuzz(int n) {
		
		if(n<1) return "Invalid Input";
		
		List<String> output=new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			if(i%3 ==0 && i%5 ==0) output.add("FizzBuzz");
			else if(i%3 ==0) output.add("Fizz");
			else if(i%5 ==0) output.add("Buzz");
//			else output.add(Integer.toString(i));
			else output.add(""+i);
		}
		
		return output.toString();
	}

}
