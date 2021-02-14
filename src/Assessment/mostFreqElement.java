package Assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class mostFreqElement {
	/*Pseudocode:
	1. Store occurance of all numbers in count array
	2. Find the max
	3. return the corresponding number*/ /*-> This method is applicable for only positives if negative go for second*/
	
	/*Alternate:
		1. Add number and count to map as key value pair
		2. Find the max value in map and return all its corresponding keys*/

	@Test
	public void ex1() {
		int[] in = {4,5,2,1,5,4,2,1,0,1};
		maxNumber(in);

	}

	@Test
	public void ex2() {
		int[] in = {1,2,3,4,2,3,4};
		maxNumber(in);

	}
	
	@Test
	public void ex3() {
		int[] in = {1,2,3,4,1,2,3,4}; // all values are answers
		maxNumber(in);

	}
	
	@Test
	public void ex4() {
		int[] in = {};//exception
		maxNumber(in);

	}

	private List<Integer> maxNumber(int[] in) {
		if(in.length<1) throw new RuntimeException("Array size < 0");
		int[] count = new int[10];
		Arrays.fill(count,0);
		int max = 0;
		List<Integer> op = new ArrayList<>();
		for (int i = 0; i < in.length; i++) {
			count[in[i]]++;
			max = Math.max(max, count[in[i]]);
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				op.add(i);
			}
		}
		System.out.println(op + "is repeated for "+ max + " times");
		return op;
	}			
}
