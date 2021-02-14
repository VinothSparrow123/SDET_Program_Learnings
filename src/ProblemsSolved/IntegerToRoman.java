package ProblemsSolved;

import org.junit.Test;

public class IntegerToRoman {
	/*
	 * Convert the Integer to Roman representation
	 */
	
	String[] ones= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	String[] tens= {"","","X","XX","XXX","XXXX","XXXXX","XXXXXX","XXXXXXX","XXXXXXXX","XXXXXXXXX"};
	
	@Test
	public void data1() {
		int num= 2345;
		System.out.println(numberToRoman(num));
	}

	private String numberToRoman(int num) {
		if(num == 0)	return "Zero";
		if(num < 0)		return "Invalid Input";
		return recuriveForRomans(num);
	}

	private String recuriveForRomans(int num) {
		if(num >= 1000000000) return recuriveForRomans(num/1000000000) + recuriveForRomans(num%1000000000);
		if(num >= 1000000) return recuriveForRomans(num/1000000) + recuriveForRomans(num%1000000);
		if(num >= 10000) return recuriveForRomans(num/10000) + recuriveForRomans(num%10000);
		if(num >= 100) return recuriveForRomans(num/100) + recuriveForRomans(num%100);
		if(num >= 10) return tens[num/10] + recuriveForRomans(num%10);
		return ones[num];
	}

}
