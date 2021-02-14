package ProblemsSolved;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class commonInTHreeStrings {
	/*
	 * Given an array of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  
		For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
		You may return the answer in any order.
		Input: ["bella","label","roller"]
		Output: ["e","l","l"]
		Input: ["cool","lock","cook"]
		Output: ["c","o"]
	 * 
	 */
	
	/*
	 * Pseudo Code
	 * 
	 * Split the input into individual string
	 * And convert the indiv string to char[] and initialize i=0;
	 * Iterate using two for loop with second and third string in the input j,k
	 * for (inp1[i]=inp2[j])
	 * 		Yes  for (inp1[i]=inp1[k])
	 * 			Yes -> Add the element into the new output array
	 * 			No -> k++
	 * 		No -> j++
	 * i++
	 * 
	 */
	
	/*
	 * Find the intersection elements 
	 * and 
	 */
	
	@Test
	public void data1() {
		String[] inp= {"bella","label","roller"};
		getCommonValues(inp);
	}
	
	private List<Character> getCommonValues(String[] inp) {
		List<Character> output=new ArrayList<>();
		char[] inp1=inp[0].toCharArray();
		char[] inp2=inp[1].toCharArray();
		char[] inp3=inp[2].toCharArray();
		
		int i=0;
		while(i<inp1.length) {
		for(int j=0;j<inp2.length;j++) {
			if(inp1[i]==inp2[j]) {
				for(int k=0;k<inp3.length;k++) {
//					if(inp1[i])
				}
			}

		}
		}
		
		return output;
	}
	

}
