package SeccondAssessment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class controlDevice {
	
	/*
	 * A control device has 4 buttons that can be used to move a character
		around a screen in 4 directions: Up (U), Down (D), Left (L), and Right (R).
		The movement needs to be optimized by deleting unnecessary
		instructions while maintaining the same destination. Given the original
		set of instructions, what is the maximum number that can be deleted
		and still have the character reach the destination?
	 */
	
	@Test
	public void data0() {
		String input= "RRUDUDUD";
		System.out.println(getMaxDeletions(input));
	}
	
	@Test
	public void data1() {
		String input= "RUDRL";
		System.out.println(getMaxDeletions(input));
	}
	
	@Test
	public void data2() {
		String input= "RRRRRR";
		System.out.println(getMaxDeletions(input));
	}
	
	@Test
	public void data3() {
		String input= "RRULLDDD";
		System.out.println(getMaxDeletions(input));
	}
	
	@Test
	public void data4() {
		String input= "LRURURURURURUL";
		System.out.println(getMaxDeletions(input));
	}
	
	@Test
	public void data5() {
		String input= "LRLR";
		System.out.println(getMaxDeletions(input));
	}
	
	@Test
	public void data6() {
		String input= "R";
		System.out.println(getMaxDeletions(input));
	}
	
	/*Approach 1:
	 * 
	 * Divide the string to the character
	 * 
	 */
	
	private int getMaxDeletions(String input) {
		int max=0;
		char[] inparr=input.toCharArray();
		List<Character> list=new ArrayList<>();
		for(Character ch:inparr) {
			list.add(ch);
		}
				
		int left=0;int right=list.size()-1;
		
		if(left==right) {
			left++;
			right=list.size()-1;
		}
		
		while(left<right) {
			if((list.get(left)=='U' && list.get(right)=='D') || (list.get(left)=='D' && list.get(right)=='U')
					||(list.get(left)=='R' && list.get(right)=='L')||(list.get(left)=='L' && list.get(right)=='R') ) {
				list.remove(list.get(right));
				list.remove(list.get(left));
				left=0;right=list.size()-1;
			}else {
				right--;
			}

		}
		
		
		return inparr.length-list.size();
	}

}
