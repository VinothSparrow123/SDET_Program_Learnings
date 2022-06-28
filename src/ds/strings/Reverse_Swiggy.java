package ds.strings;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class Reverse_Swiggy {
	@Test
	public void data1() {
		String input="today is beautiful day";
		System.out.println(getReversedWord(input));
	}

	private String getReversedWord(String input) {
		// TODO Auto-generated method stub
		String[] inputArr=input.split("\\s");
		System.out.println(Arrays.toString(inputArr));
		StringBuilder output=new StringBuilder();
		
		boolean flag=false;
		
		for (int i = inputArr.length-1; i >= 0; i--) {
			if(flag==true) {
				StringBuilder sb=new StringBuilder(inputArr[i]);
				sb.reverse();
				output.append(sb+" ");
				flag=false;
			}else {
				output.append(inputArr[i]+" ");
				flag=true;
			}
		}
		
//		StringBuilder sb=new StringBuilder(input);		
		
		return output.toString();
		
	}
	
	
	
	
}
