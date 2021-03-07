package CommonMathProblems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SquareRoot {
	@Test
	public void data1() {
		double input=25;
		System.out.println(getSquareRoot(input));
	}

	private double getSquareRoot(double input) {
		// TODO Auto-generated method stub
		
		return Math.sqrt(input);
	}
	
	
	
	
	public void getOccurance(String input) {
		
		Map<Character,Integer> map=new HashMap<>();
		
		char[] inputch=input.toCharArray();
		
		for (int i = 0; i < inputch.length; i++) {
			map.put(inputch[i], map.getOrDefault(inputch[i], 0)+1);
		}
		System.out.println(map);
	}
	
	
//	O(N)
//	Space - O(1)
	
	
	
	
	
	
	
	class GFG  
	{ 
	      
	    // Function to return the sum  
	    // of the digits of num^2  
	    static long squareDigitSum(String s)  
	    {  
	        // To store the number of 1's  
	        long lengthN = s.length();  
	      
	        // Find the sum of the digits of num^2  
	        long result = (lengthN / 9) * 81 +  
	                      (long)Math.pow((lengthN % 9), 2);  
	      
	        return result;  
	    }  
	      
	    // Driver code  
	    public static void main (String[] args) 
	    {  
	        String s = "1111";  
	      
	        System.out.println(squareDigitSum(s));  
	  
	    }  
	} 
	
	public class A {
		public void add1() {
		}
		public void sub() {
			
		}
	}
	public class B extends A {
		public void add1() {
			
		}
		public void mul() {
				
			}
		public void div() {
			
		}
		public void main() {
			A ab = new B();
//			ab.
			ab.add1();
			ab.sub();
			ab.mul();
			ab.div();

			
			B ba = new A();
//			ba.s
			ba.add1();
			ba.sub();
			ba.mul();
			ba.div();

		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
