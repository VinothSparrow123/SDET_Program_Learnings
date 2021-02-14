package ds.arrays;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindSubArrayForGivenSum2_Hashing {
	@Test
	public void data1() {
		int[] inputArray= {5,2,8,10,2,3};
		int targetSum=10;
		hashingAlgo(inputArray,targetSum);
	}
	public void hashingAlgo(int[] inputArray,int targetSum) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		//initializing the first number in map with negative number
		//I have seen like if a value is not present in an array and if we want the index ,it returns is -1
		map.put(0, -1);
		
		//declaring sum to store
		int sum_so_far=0;
		
		for(int i=0;i<inputArray.length;i++) {
			sum_so_far += inputArray[i];
			
			int diff=sum_so_far-targetSum;
			
			//verify the diff available in HashMap
			if(map.containsKey(diff)) {
				System.out.println("Found the subarray : {"+(map.get(diff)+1)+" , "+i+"}" );
			}
			
			map.put(sum_so_far, i);
			
		}
		
	}
}
