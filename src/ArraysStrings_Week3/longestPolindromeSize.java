package ArraysStrings_Week3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class longestPolindromeSize {
	
	@Test
	public void data1() {
		String input="bananas";
		solution1(input);
	}
	
	@Test
	public void data2() {
		String input="!@#$%^%$#@!7890";
		solution1(input);
	}
	
	@Test
	public void data3() {
		String input="1234543290";
		solution1(input);
	}
	
	@Test
	public void data4() {
		String input="vinothkumar";
		solution1(input);
	}
	
	private void solution1(String input){
        String maxP= "" ;
        
        Set<String> set = new HashSet<String>();
        for(int i=0; i< input.length(); i++){
            for(int j=i+1; j<= input.length(); j++){
                set.add(input.substring(i,j));
            }
        }
        System.out.println(set);
        
        Iterator<String> iterator = set.iterator(); 
        while (iterator.hasNext()) {
            StringBuilder s = new StringBuilder(iterator.next());
            if(s.toString().equals(s.reverse().toString())){
                if(s.length()>maxP.length())
                    maxP = s.toString();
            }
        }
        System.out.println(maxP);
        System.out.println(maxP.length());
    }

}
