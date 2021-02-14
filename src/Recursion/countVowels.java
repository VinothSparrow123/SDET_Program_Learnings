package Recursion;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.junit.Test;

public class countVowels {
	/*
	 * Given an integer n, return the number of strings of length n that consist only of vowels 
	 * (a, e, i, o, u) and are lexicographically sorted.

A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.

 

Example 1:

Input: n = 1
Output: 5
Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].
	 */
	
	@Test
	public void data1(){
		int k = 3;
		System.out.println(countVowels(k));
	}
	
	@Test
	public void data2(){
		int k = 4;
		System.out.println(countVowels(k));
	}

	private int countVowels(int k) {
		
		List<String> output=new ArrayList<>();
		Character[] vowel= {'a','e','i','o','u'};
		Set<Character> set=new HashSet<>(Arrays.asList(vowel));
		Iterator<Character> I=set.iterator();
		
		System.out.println(I.hasNext());
		
		return output.size();
	}
	
	
	Character[] vowel= {'a','e','i','o','u'};
//	List<Character> vowels=new ArrayList<>(Arrays.asList(vowel));
	
	
	
	
	
	public List<String> recursion(int k,List<String> output,StringBuffer str,int index) {
		StringBuffer tempStr=new StringBuffer();
		if(k == output.get(output.size()-1).length()) {
			output.add(tempStr.toString());
			return output;
		}
		
		tempStr.append(vowel[index++]);
		
		recursion(k, output, tempStr, index);
		
		
	}
}
