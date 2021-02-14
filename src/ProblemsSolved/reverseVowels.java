package ProblemsSolved;

import java.util.Arrays;

import org.junit.Test;

public class reverseVowels {
	/*Write a solution to reverse only the vowels of a string.
	Input: "hello"
	Output: "holle"
	"aeiou"
	"uoiea"
	"testliaaf"
	"tastlaief"
	 * 
	 */

	@Test
	public void dataSet1() {
		String str = "hallo";
		swapVowel(str);
	}

	@Test
	public void dataSet2() {
		String str = "vinqth";
		swapVowel(str);
	}
	@Test
	public void dataSet3() {
		String str = "testliaaf";
		swapVowel(str);
	}
	@Test
	public void dataSet4() {
		String str = "aAeIOOoo";
		swapVowel(str);
	}

	public void swapVowel(String str) {
		char[] ch = str.toLowerCase().toCharArray();
		int i =0,j=str.length()-1;
		while(i<j) {
			if((ch[i] == 'a' ||ch[i] == 'e' || ch[i] =='i' || 
					ch[i] =='o' || ch[i] =='u') &&
					(ch[j] == 'a' ||ch[j] == 'e' || ch[j] =='i' || 
					ch[j] =='o' || ch[j] =='u')    ) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++; j--;
			}
			else if((ch[i] == 'a' ||ch[i] == 'e' || ch[i] =='i' || 
					ch[i] =='o' || ch[i] =='u')) {
				j--;
			}
			else i++;
		}
		System.out.println(Arrays.toString(ch));
	}


}
