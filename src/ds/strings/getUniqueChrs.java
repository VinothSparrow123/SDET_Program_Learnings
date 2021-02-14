package ds.strings;

import org.junit.Test;

public class getUniqueChrs {
	
	@Test
	public void data1(){
	    String str = "abcadba";
	    System.out.println(retrunDuplicates(str));
	}
	    
	    
	 private String retrunDuplicates(String str) {
	     String output = "";
	     for (int i = 0; i < str.length(); i++) {
	            if(!output.contains(String.valueOf(str.charAt(i)))) {
	                output += String.valueOf(str.charAt(i));
	            }
	        }   
	    return output;
	}

}
