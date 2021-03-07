package ds.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class WordBreak_Recursion {
	@Test

	public void example1() {
//		String s = "leetcode";
//		List<String> li = new ArrayList<String>();
//		li.add("leet");
//		li.add("code");
//		System.out.println("One"+wordBreak(s,li));
//		System.out.println("One"+wordBreak(s,li));
	}



	@Test

	public void example2() {



		String s = "applepenapple";
		List<String> li = new ArrayList<String>();
		li.add("apple");
		li.add("pen");
		System.out.println("Two"+wordBreak(s,li));
		System.out.println("Two"+isFound(s,li));



	}
	@Test
	public void example3() {
	String s = "catsanddog";
		List<String> li = new ArrayList<String>();
		li.add("cats");
		li.add("dog");
		li.add("sand");
		li.add("and");
		li.add("cat");
		System.out.println("Three"+wordBreak(s,li));
		System.out.println("Three"+isFound(s,li));
	}

	@Test
	public void example4() {
		String s = "abcd";
		List<String> li = Arrays.asList(new String[] {"a","abc","d","cd","b"});
		System.out.println("Four"+wordBreak(s,li));
		System.out.println("Four"+isFound(s,li));
	}
	
	@Test
	public void example5() {
		String s = "aaaaaaa";
		List<String> li = Arrays.asList(new String[] {"aaa","aaaa"});
		System.out.println("Five"+wordBreak(s,li));
		System.out.println("Five"+isFound(s,li));
	}
	
	public boolean wordBreak(String s, List<String> wordDict) 
	{
		return wordBreakrec(0,s,wordDict);
	}

	private boolean wordBreakrec(int start, String s, List<String> wordInDict)
	{
		if(start==s.length()) return true;
		
		for(int i=start+1;i<=s.length();i++)
		{
			System.out.println(s.substring(start, i));
			if((wordInDict.contains(s.substring(start, i)))&&(wordBreakrec(i,s,wordInDict)))
			{
				return true;
			}
		}
		return false;
	}
	
	 private Boolean isFound(String s,int start,int length,List<String> dict)
     
	    {
	        if(start==length) return true;
	        for(int i=start;i<length;i++)
	        {
	            if(i<length&&dict.contains(s.substring(start,i+1)))
	               if(isFound(s,i+1,length,dict))
	            	   return true;
	        }
	        return false;
	    }
}
