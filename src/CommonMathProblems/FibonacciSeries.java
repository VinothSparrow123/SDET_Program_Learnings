package CommonMathProblems;

import org.junit.Test;

public class FibonacciSeries {
	@Test
	public void data1() {
		int count=10;
//		System.out.println(
		printFibonacci(count);
	}

	private void printFibonacci(int count) {
		// TODO Auto-generated method stub
		{
	        int f1 = 0, f2 = 1, i;
	 
	        if (count < 1)
	            return;
	        System.out.print(f1 + " ");
	        for (i = 1; i < count; i++)
	        {
	            System.out.print(f2 + " ");
	            int next = f1 + f2;
	            f1 = f2;
	            f2 = next;
	        }
	    }
		
	}
}
