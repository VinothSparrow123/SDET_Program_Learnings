package ProblemsSolved;

import org.junit.Test;

public class AbsoluteSquareRoot {
	
	/*
	 * Find the square root of the given number
	 */
	
	/*
	Pseudo code - Linear - O[N]
	check if number is 1, return 1
	traverse the loop from index 2 to number/2
		check if index*index = number
		return the index
	loop end
	return -1

	Pseudo code - Binary search - O[log N]
	initialize low = 1, high = number/2
	while loop - check if low < high
		add low & high divide by 2 and store in mid value
		currentMid = mid*mid
		if currentMid equals number, return mid
		else if currentMid lesser than number, assign low = mid+1
		else assign high = mid -1
	loop end
	return -1	
	 */

	@Test
	public void testData1(){
		int input = 169;
		//System.out.println(solution(input));
	}
	@Test
	public void testData2(){
		int input = 10000;
		//System.out.println(solution(input));
	}
	@Test
	public void testData3(){
		int input =8;
		//System.out.println(solution(input));
		System.out.println(solutionAbs(input));
	}
	
	public int solution(int number) {
		int low = 1, high = number/2,count =0;
		if(number ==1 || number == 0)
			return number;
		while (low <= high) {
			count++;
			int mid = (low+high)/2;
			int currentMid = mid*mid;
			if(currentMid == number) {
				System.out.println(count);
				return mid;
			}
			else if(currentMid < number) low = mid+1;
			else high = mid -1;

		}
		return -1;
	}

	public float solutionAbs(int number) {
		float low = 0, high = number;
		if(number ==1 || number == 0)
			return number;
		while (low <= high) {
			float mid =(low+high)/2;
			float currentMid = mid*mid;
			if(Math.round(currentMid) == number) {
				return mid;
			}
			else if(currentMid < number) low = mid;
			else high = mid;

		}
		return -1;
	}
	
}
