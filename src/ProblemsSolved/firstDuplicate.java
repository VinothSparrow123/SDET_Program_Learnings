package ProblemsSolved;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class firstDuplicate {

	/*
	 * Write a function to print the first duplicate number in the array
		Example: [4,1,2,9,1]
		Output: 1
	 */

	/*Pseudo Code
	 * 
	 * Iterate using two for loops
	 * Coompare (i= j)
	 * If Yes - > Print the same an break the loop
	 * 		No -> Iterate again untill meet the length of an array
	 */

	@Test
	public void data1() {
		int[] inp= {4,1,2,9,1};
		getFirstDuplicate(inp);
	}

	private void getFirstDuplicate(int[] inp) {
		int i=0;
		while(i<inp.length-1){
			for(int j=1;j<inp.length;j++) {
				if(inp[i]==inp[j]) {
					System.out.println(inp[i]);
					break;
				}
			}
		}
	}
	
	/*Approach2
	 * 
	 * Add it to map
	 * Find which character value is greater than 1, if yes print it out
	 */
	
	public void getFirstDups (int[] inp) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<inp.length;i++) {
			map.put(inp[i], map.getOrDefault(inp[i], 0)+1);
		}
		if(!map.containsValue(1)) {
			System.out.println();
		}
	}
}