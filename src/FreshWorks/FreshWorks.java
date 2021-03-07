package FreshWorks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FreshWorks {
	/* Pseudo Code
	 * 
	 * Initialize a set
	 *	 
	 */

	@Test
	public void data1() {
		int[] input1= {2,3,4,5};
		int[] input2= {2};
//		int[] input3= {2,3};
//		int[] input4= {2,3,4};
		getIntesection(input1,input2);
	}
	
	public int[] getIntesection(int[] input1,int[] input2) {
		//add input1 ele into one set
		Set<Integer> set1=new HashSet<>();
		for (int i = 0; i < input1.length; i++) {
			set1.add(input1[i]);
		}
		
		//add input2 ele into set 2
		Set<Integer> set2=new HashSet<>();
		for (int i = 0; i < input2.length; i++) {
			set1.add(input2[i]);
		}
		
		if(set1.size()<set2.size()) {
//			return getIntersectionOfSets(set1,set2);
			set1.retainAll(set2);
		}
		else {
			return getIntersectionOfSets(set2,set1);
		}
		
	}
	
	public int[] getIntersectionOfSets(Set<Integer> set2,Set<Integer> set1) {
		
		int[] output=new int[set1.size()];
		
		int count=0;
		
		for (Integer s : set1) {
			if(set2.contains(s)) {
				output[count++]=s;
			}
		}
		
		return Arrays.copyOf(output, count);
	}
	
	public int[] getIntesectionOneSet(int[] input1,int[] input2) {
		
		
		
		for (int i = 0; i < input2.length; i++) {
			
		}
		
	} 
}
