package ProblemsSolved;

import org.junit.Test;

public class findOccurances {

	/*Find maximum consecutive occurances of the given string
	 * Document_2811
	 * 
	 */

	/*Pseudo Code
	 * 1. Split the string into character array, define count=0
	 * 2. using two for loops compare the first element with next element i, j
	 * 3. If first element matches the second, increase the count value and capture the i value as well
	 * 		And increase the j value
	 * 4. if it doestn't match i++
	 * 5. Continue the iteration, if the occurance value increase count then store the new i 
	 */

	@Test
	public void data1() {
		String input="Amazon is great from AtooooZzzz";
		findOccurances(input);
	}

	@Test
	public void data2() {
		String input="Amazon is greeeeat from AtooooZzzz";
		System.out.println(findOccurances(input));
	}

	@Test
	public void data3() {
		String input="Amazon is great from AtoZ";
		System.out.println(findOccurances(input));
	}

	private int findOccurances(String input) {

		char[] inputChar=input.toCharArray();
		int length=inputChar.length;

		int count=0;
		int maxCount=0;

		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(inputChar[i]==inputChar[j]) {
					count++;
				}else {
					count=0;
				}
				maxCount=Math.max(count, maxCount);
			}
		}
		return maxCount;
	}
}
