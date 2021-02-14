package ds.arrays;

import org.junit.Test;


public class monotonicArray_BruteForce2_ByHandlingSameElement {
	
	@Test
	public void data1() {
		int[] inputArray= {1,2,3,3,4,4,4,4,5};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	@Test
	public void data2() {
		int[] inputArray= {1,2,5,3,4,4,4,4,5};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	@Test
	public void data3() {
		int[] inputArray= {5,4,2,2,1};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	@Test
	public void data4() {
		int[] inputArray= {};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	@Test
	public void data5() {
		int[] inputArray= {5,4,3,0,-3,-5};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	@Test
	public void data6() {
		int[] inputArray= {5,4,3,0,3,-3,-5};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	@Test
	public void data7() {
		int[] inputArray= {5,5,5,6};
		if(findMonoomicArray_BruteForce(inputArray)==true) {
			System.out.println("Given array is a monotomic array");
		}else {System.out.println("Given array is not a monotomic array");}
	}
	
	
	
	/*Approach1 - BRUTE FORCE
	1. Initially set the given array as monotonic 
	2. Compare the first two elements in the array
	   2.1 If the first element is greater, then any of the rest elements cannot be greater than that to form a monotonic array
	   		So loop through rest of the elements with negative condition (>)
	   2.2 If the first element is lesser, then any of the rest elements cannot be lesser than that to form a monotonic array
	   		So loop through rest of the elements with negative condition (<)
	*/
	
	
	public boolean findMonoomicArray_BruteForce(int[] inputArray) {
		boolean increasing=true;
		boolean decreasing=true;
	    if(inputArray.length <= 1) {
	        return increasing=false;}
	    for(int i = 0; i < inputArray.length - 1; i++){ //1,2,3,3,4,4,4,4,5
	            if(inputArray[i] < inputArray[i + 1]){
	                for(int j = i + 1; j < inputArray.length - 1; j++){
	                    if(inputArray[j] > inputArray[j + 1])
	                    	return increasing=false; //O[N*M]
	                }
	                break;
	            }
	            else if(inputArray[i] > inputArray[i + 1]){
	                for(int j = i + 1; j < inputArray.length - 1; j++){
	                    if(inputArray[j] < inputArray[j + 1])
	                    	return decreasing=false; //O[N*M]
	                }
	                break;
	            }
	            else if(inputArray[i] == inputArray[i + 1]){
	                for(int j = i + 1; j < inputArray.length - 1; j++){
	                    if(inputArray[j] == inputArray[j + 1])
	                    	return decreasing=false;increasing=false; //O[N*M]
	                }
	                
	            }
	        }
	        return increasing||decreasing;
	}
	//Time Complexity of the above is: O[N*M] + O[N*M] = O[N*M] Worst case 
//Equal condition
}