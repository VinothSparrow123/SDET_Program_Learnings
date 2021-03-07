package ProblemsSolved;

import org.junit.Test;

public class ExcelColumnNumber {
	/*
	 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
	 */
	
	@Test
	public void data1() {
		int input= 29;
		System.out.println(getExcelColumNumber(input));
	}
	
	@Test
	public void data2() {
		int input= 2;
		System.out.println(getExcelColumNumber(input));
	}
	
	@Test
	public void data3() {
		int input= 156;
		System.out.println(getExcelColumNumber(input));
	}

	private String getExcelColumNumber(int input) {
		String englishLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int length=englishLetters.length();
		
		String columnName="";
		
		while(input>0) {
			
			int remainder=input%length; //3
			input=input-remainder;//26
			
			if(remainder == 0) {
				columnName=englishLetters.charAt(length-1)+columnName;
				input=input-length;
			}else {
				columnName=englishLetters.charAt(remainder-1)+columnName;
			}
			
			
		}
		
		
		return columnName;
	}
}
