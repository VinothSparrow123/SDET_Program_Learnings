package FirstAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class moveOddNumberToEnd {
	
	/*Move all the Odd Number to the right
	 * 
	 * Identify the even and zero elements and add it from the base position
	 * If it is a odd element try to add it in the last
	 */
	
	
	@Test
	public void data1() {
		int[] input= {0,2,1,0,5,0,3,12};
		System.out.println(moveOddNumbers(input));
		System.out.println(moveOddNumbers_up(input));
	}
	
	@Test
	public void data2() {
		int[] input= {2,1,5,3,12,1,3,5,7,7,7,0,0};
		System.out.println(moveOddNumbers(input));
		System.out.println(moveOddNumbers_up(input));
	}
	
	/*Two pointer approach
	 * 
	 * 
	 */
	
	
	private String moveOddNumbers(int[] input) {
		
		int left=0; int right=input.length-1;
		
		while(left<right) {
			while(input[left]%2==0 && left<right) {
				left++;
			}
			while(input[right]%2==1 && left<right) {
				right--;
			}
			if(left<right) {
				int temp=input[left];
				input[left++]=input[right];
				input[right--]=temp;
			}
			
			}
		
		return Arrays.toString(input);
		}
		
		/*for (int i = 0; i < input.length; i++) {
			if(input[i]%2==1) {
				for (int k = input.length-1; k >= 0; k--) {
					if(input[k] % 2==0) {
						int temp=input[i];
						input[k]=input[i];
						input[i]=temp;
						i++;
					}
				}
			}
		}
		
		return Arrays.toString(input);
	}*/
	
	private String moveOddNumbers_up(int[] input) {
		
		int left=0; int right=input.length-1;
		
		while(left<right) {
			if(left<right) {
				int temp=input[left];
				input[left++]=input[right];
				input[right--]=temp;
			}
			if(input[left]%2==0) {
				left++;
			}
			if(input[right]%2==1) {
				right--;
			}
			}
		
		return Arrays.toString(input);
		}
	
	


	    public static List<Integer> moveOddNumber(List<Integer> numbers) {
			List<Integer> oddNumbers  = new ArrayList<Integer>();
			List<Integer> evenNumbers =  new ArrayList<Integer>();
			
	    	for (int i = 0; i < numbers.size(); i++) {
				if(numbers.get(i)%2 == 1) {
					oddNumbers.add(numbers.get(i));
				}else {
					evenNumbers.add(numbers.get(i));
				}
			}
		    	evenNumbers.addAll(oddNumbers);    	
			return evenNumbers;
	    }
}
