package ds.arrays;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class sumIndices {
	
	
	@Test
	public void examples() {
		int[] numbers= {0,2,4,5,6,2,1,3};
		int target=6;
		int[] sumIndices=getIndices(numbers,target);
		System.out.println(Arrays.toString(sumIndices));
		
	}
	
	//Brute Force Technique - Using general standard approach to find the solution
	//Time complexity of the below solution is: N^2
	private int[] getIndices(int[] numbers,int target) {
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]+numbers[j]==target) {
					System.out.println("The indices are "+i+" & "+j);
					return new int[] {i,j};
				}
			}
		}
		throw new RuntimeErrorException(null, "There is no matcheds");
	}

}