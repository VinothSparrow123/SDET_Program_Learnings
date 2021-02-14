package ProblemsSolved;

import java.util.Arrays;

import org.junit.Test;

public class reversingTheText {
	/*
	 * Reversing the text and reversing only the alternate words
	 */

	@Test
	public void data1() {
		String 	inputSen="There is no Test";
		System.out.println(reverseusingStringBuilder(inputSen));
	}
	
	/*Brute Force:
	 * StringBuilder can be used to reverse the text
	 * 
	 */
	
	/*Pseudo Code:
	 * 
	 * Split the string to string array by using space
	 * Then reverse the each text
	 * Then with the reverse text, when i%2=0
	 * Yes -> reverse the individual characters
	 * No -> Keep it as like that 
	 * Return the reversed String 
	 * 
	 */
	
	public String[] getReversedText(String inputSen) {
		String[] stringArr=inputSen.split(" ");
		

		/*
		 * //Reversing the string int left=0;int right=stringArr.length-1; while(left
		 * <right) { String temp=stringArr[left]; stringArr[left]=stringArr[right];
		 * stringArr[right]=temp;left++;right--; }
		 */
		
		String revSentense="";

		for(int i=stringArr.length-1;i>=0;i--) {
			revSentense=revSentense+stringArr[i]+" ";
		}
		 System.out.println(revSentense);
		
		//Reversing the characters
		 
		
		int j=0;
		String[] reversed=revSentense.split(" ");
		while(j<reversed.length) {
			if(j%2==0) {
				char[] revChar=reversed[j].toCharArray();
				int left=0;int right=revChar.length-1;
				for(int k=0;k<revChar.length;k++) {
					char temp=revChar[left]; 
					revChar[left]=revChar[right];
					revChar[right]=temp;left++;right--;}
				reversed[j]=revChar.toString();
				
			}else {j++;}
		} 
		
		/*//Reversing the characters
		int j=stringArr.length-1;
		for(int i=0;i<stringArr.length;i++) {
			if(i%2 == 0) {
				char[] stringChar=stringArr[i].toCharArray();
				char temp=stringChar[i];
				stringChar[i]=stringChar[i];
				stringChar[j]=temp;i++;j--;
			}
		}*/
		System.out.println(reversed);
		
		return reversed;
	}
	
	/*Pseudo Code:
	 * 
	 * Split the sentense to string array
	 * set flag=false
	 * Declare the output string builder
	 * 
	 * Decremental for loop... where add the string[1] to string builder
	 * If flag = false -> reverse the string and append
	 * If flag = true  -> append the string with output
	 */
	
	public String reverseusingStringBuilder(String inpSen) {
		
		StringBuilder reversedOutput=new StringBuilder();
		boolean reverse=false;
		String[] str=inpSen.trim().split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			StringBuilder sb1=new StringBuilder(str[i]);
			if(reverse==false) {
				reversedOutput.append(sb1.reverse());
				reverse=true;
			}
			else {
				reversedOutput.append(sb1);
				reverse=false;
			}
			reversedOutput.append(" ");
		}
		
		
		return reversedOutput.toString();
	}
	

}
