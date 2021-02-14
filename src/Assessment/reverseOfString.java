package Assessment;

import org.junit.Test;

public class reverseOfString {
	/*Pseudocode:
	1. Split String to array based on <spaces>, create a output
	2. iterate from last element of created array, set a flag to true
	3. if odd iteration (condition flag == true) reverse the string and set flag to false append with output
	3. if even iteration (condition flag == false)  set flag to true append with output
*/
	@Test
	public void ex1() {
		String s = "There is no Test";
		System.out.println(reverseInGivenForm(s));
	}
	
	@Test
	public void ex2() {
		String s = "There"; //Single word String
		System.out.println(reverseInGivenForm(s));
	}
	
	@Test
	public void ex3() {
		String s = "A  B  C"; //More than one space
		System.out.println(reverseInGivenForm(s));
	}
	
	@Test
	public void ex7() {
		String s = "vinoth ab ba"; //More than one space
		System.out.println(reverseInGivenForm(s));
	}

	private String reverseInGivenForm(String s) {
		String[] split = s.split(" ");
		StringBuilder output =new StringBuilder();
		
		boolean flag = true;
		for (int i = split.length-1; i >=0; i--) {
			if(flag) {
				StringBuilder temp =new StringBuilder();
				temp.append(split[i]);
				temp = temp.reverse();
				output.append(temp);
				output.append(" ");
				flag = false;
			}else {
				StringBuilder temp =new StringBuilder();
				temp.append(split[i]);
				output.append(temp);
				output.append(" ");
				flag = true;
			}
		}
		return output.toString().trim();
	}
	
}
