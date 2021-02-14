package ProblemsSolved;

import org.junit.Test;

public class IntegerToEnglish {
	
	String[] ones={"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	String[] tens= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

	/*
	 * Convert a Integer to its English words representation.
		Input: num = 123
		Output: "One Hundred Twenty Three"
		Input: num = 1,234,567
		Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
	 */
	
	/*Pseudo COde
	 * 
	 * 1) Convert a Integer to its English words representation.
Input: num = 123
Output: "One Hundred Twenty Three"
Input: num = 1,234,567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
Input: 1000000
Output: One Million
Input: 511
Output: Five Hundred Eleven
Input: 40
Output: Forty
Input: 0
Output: Zero
Input: -1
Output: Invalid
---
		pseudo-code:
			Step 1: 
				list1 = 0 - 10, 11 - 19, 
				list2 = 20, 30, 40, 50, 60, 70, 80, 90
				list3 = 100, 1000, exce, 100000000
			Step 2:
				Declare output string variable
				if(input < 100){
			    check if input < 20, go to list1 and return it's value;
			    
			    if input > 20, 
			        then divide input/10
			        else check input is in list2
					}
					input = 1234/100;
					recursion(1234);
					}
			 	
			 	
			 
			String 3digitMethod(i=567){
			    
			    if(i>0){
			    i= i/10;
			    remainder=i%10;
			    String(Print reminder)
			    }
		    
		    
		     
		}
	 * 
	 */
	
	@Test
	public void data1() {
		int num=1234567899;
		System.out.println(getEnglishForInteger(num));
	}

	private String getEnglishForInteger(int num) {
		if(num == 0)	return "Zero";
		if(num < 0)		return "Invalid Input";
		return recuriveForWords(num);
	}

	private String recuriveForWords(int num) {
		if(num >= 1000000000) return recuriveForWords(num/1000000000) + " Billion " + recuriveForWords(num%1000000000);
		if(num >= 1000000) return recuriveForWords(num/1000000) + " Million " + recuriveForWords(num%1000000);
		if(num >= 10000) return recuriveForWords(num/10000) + " Thousand " + recuriveForWords(num%10000);
		if(num >= 100) return recuriveForWords(num/100) + " Hundred " + recuriveForWords(num%100);
		if(num >= 20) return tens[num/10] + recuriveForWords(num%10);
		return ones[num];
	}

}
