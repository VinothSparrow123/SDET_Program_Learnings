package FirstAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class howManyWords {
	
	/*A sentence is made up of a group of words. Each word is a sequence of
		letters, ('a'-'z', 'A'-'Z'), that may contain one or more hyphens and may
		end in a punctuation mark: period (.), comma (,), question mark (?), or
		exclamation point (!). Words will be separated by one or more white
		space characters. Hyphens join two words into one and should be
		retained while the other punctuation marks should be stripped.
		Determine the number of words in a given sentence.
	 */
	
	@Test
	public void data1() {
		String inpSen="Vinoth is a good guy but some people would-say he is 420 vi420";
		System.out.println(howManyWords(inpSen));
	}
	
	@Test
	public void data2() {
		String inpSen="he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
		System.out.println(howManyWords(inpSen));
	}
	
	@Test
	public void data3() {
		String inpSen="jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878 dwa WE DE 7475 dsfh ds RAMU 748 dj.";
		System.out.println(howManyWords(inpSen));
	}
	
	
	/*Approach:
	Split the sentense into the words using space regex and add it in the list
	Itearate the each string, if it contains numbers only then remove it
	
	*/
	
	private int howManyWords(String inpSen) {
		if(inpSen==null || inpSen.isEmpty()) {
			return 0;
		}
		int wordCount=0;
		String[] words=inpSen.split(" ");
		System.out.println(Arrays.toString(words));
		for(int i=0;i<words.length;i++) {
			if(words[i].matches("[A-Za-z?.,!:-]+")) {
				wordCount++;
			}
		}
		return wordCount;
	}
	
	
}
