package ProblemsSolved;

import java.util.Arrays;

import org.junit.Test;

public class FindMaximumMobiles {

	/*
	 * Find the maximum number of mobile can be added in truck
	 * 
	 * Input: mobileTypes = [[1,3],[2,2],[3,1]], truckSize = 4 mobileSizes
		Output: 8
	 */
	
	@Test
	public void data1() {
		int[][] mobileTypes= {{1,3},{2,2},{3,1}};
		int truckSize=4;
		int maxMobile=maxNumberOfMobiles(mobileTypes,truckSize);
		System.out.println(maxMobile);
	}
	
	@Test
	public void data2() {
		int[][] mobileTypes= {{5,10},{2,7},{1,9},{1,11},{3,1}};
		int truckSize=10;
		int maxMobile=maxNumberOfMobiles(mobileTypes,truckSize);
		System.out.println(maxMobile);
	}
	
	/*	Pseudo Code - Brute Force
	 * 
	 * Add the mobiletype and number in a map as Key and Value
	 * Add all the values into list and sort it
	 * variable: currkey, maxMobiles=0;i=list.size()-1;
	 * Iterate using while loop with condition(truckSize>0)
	 * 		get the key list[i] and store it's respective key in currkey
	 * 			if(currkey>0) -> add the value in maxMobiles and decrement 
	 * 							the key and decrement the truckSize
	 * 			if(currkey==0) -> decrement the i (i--)
	 * 		
	 */

	private int maxNumberOfMobiles(int[][] mobiles, int truck) {
        // Sort the given 2 dimension array by the second index
        Arrays.sort(mobiles, (a,b) -> b[1] - a[1]);
        int count = 0;
        for (int[] mobile : mobiles) {
            int mobileTypeCount = Math.min(truck, mobile[0]);
            count += mobileTypeCount * mobile[1];
            truck -= mobileTypeCount;
            if(truck ==0)
                break;
        }
        
        return count;
    }	
}