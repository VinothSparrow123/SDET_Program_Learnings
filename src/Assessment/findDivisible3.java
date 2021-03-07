package Assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class findDivisible3 {
	/*Pseudocode:
	1. Store occurance of all numbers in count array
	2. Find the max
	3. return the corresponding number*/ /*-> This method is applicable for only positives if negative go for second*/
	
	/*Alternate:
		1. Add number and count to map as key value pair
		2. Find the max value in map and return all its corresponding keys*/

	@Test
	public void ex1() {
		int[] in = {5,4,3,1,1};
		maxNumber(in);

	}
	
	@Test
	public void ex2() {
		int[] in = {9,9,9};
		maxNumber(in);

	}

	private void maxNumber(int[] in) throws SQLException 
	{
		Arrays.sort(in);
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < in.length; i++)
		{
			sum+=in[i];
			
		}
		
		for (int i = 0; i < in.length; i++) 
		{
			int diff = sum - in[i];
			if(diff%3 != 0 )
			{
				list.add(in[i]);
			}
		}
		
		
		Collections.reverse(list);
		
		
		System.out.println(list.toString());
		
		Connection conn=DriverManager.getConnection("");
		
	}

//	@Test
//	public void ex2() {
//		int[] in = {1,2,3,4,2,3,4};
//		maxNumber(in);
//
//	}
//	
//	@Test
//	public void ex3() {
//		int[] in = {1,2,3,4,1,2,3,4}; // all values are answers
//		check(in);
//
//	}
//	
//	@Test
//	public void ex4() {
//		int[] in = {};//exception
//		maxNumber(in);
//
//	}

	 			
}
