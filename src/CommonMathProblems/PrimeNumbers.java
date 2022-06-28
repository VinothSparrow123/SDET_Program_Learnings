package CommonMathProblems;

import org.junit.Test;


public class PrimeNumbers {
	@Test
	public void data1() {
		int count=7;
		//		System.out.println(
		System.out.println(printPrimeNumbers(count));
	}

	private void printPrimeNumbersOld(int N) 
	// TODO Auto-generated method stub
	{
		// Declare the variables
		int i, j, flag;

		// Print display message
		System.out.println("Prime numbers between 1 and "
				+ N + " are:");
		// Traverse each number from 1 to N
		// with the help of for loop
		for (i = 1; i <= N; i++)
		{ 

			// Skip 0 and 1 as they are
			// niether prime nor composite
			if (i == 1 || i == 0)
				continue;

			// flag variable to tell
			// if i is prime or not
			flag = 1;

			for (j = 2; j <= i / 2; ++j)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
			}
			

			// flag = 1 means i is prime
			// and flag = 0 means i is not prime
			if (flag == 1)
				System.out.print(i + " ");
		}}
	
	public String printPrimeNumbers(int N) {
		if(N < 0) return "Given Number is neither prime nor composite";
		int c=2;
		while(c*c <= N) {
			if(N%c == 0) return "It's not a prime";
			else c+=1;
		}
		
		return "It's a Prime number";
	}
}
