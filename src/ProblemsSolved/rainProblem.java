package ProblemsSolved;

import org.junit.Test;

public class rainProblem {
	
	/*
	 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped
	 */
	
	@Test
	public void data1() {
		int[] heights= {0,1,0,2,1,0,1,3,2,1,2,1};
		int savedRainWater = getSavedRainWater(heights);
		System.out.println(savedRainWater); //output:6
	}
	
	@Test
	public void data2() {
		int[] heights= {0,0,0,0,8,0,4,3,2,4};
		int savedRainWater = getSavedRainWater(heights);
		System.out.println(savedRainWater); //Output: 7
	}
	
	@Test
	public void data3() {
		int[] heights= {0,0,0,0,8,0,4,3,2,8};
		int savedRainWater = getSavedRainWater(heights);
		System.out.println(savedRainWater); //Output: 23
	}
	
	@Test
	public void data4() {
		int[] heights= {0,0,0,0,8,8,0,4,3,2};
		int savedRainWater = getSavedRainWater(heights);
		System.out.println(savedRainWater); //Output: 4
	}
	
	@Test
	public void data5() {
		int[] heights= {0,0,0,0,8,8,4,3,2};
		int savedRainWater = getSavedRainWater(heights);
		System.out.println(savedRainWater); //Output: 0
	}
	
	/*
	 * PseudoCode
	 * 
	 * Initialize the variables
	 * Iterate through while loop (left<=right)
	 *  (with the below logic, move to right when right value becomes greater than left
	 *  )
	 *  
	 * 	If height[left]<=height[right]
	 * 		Yes->	If height[left]>maxLeft
	 * 				Yes -> assign maxLeft=height[left]
	 *  			No -> Add the difference with rainWater
	 *  	No -> 	If height[right]>maxRight
	 * 				Yes -> assign maxRight=height[right]
	 *  			No -> Add the difference with rainWater
	 * 
	 */
	
	private int getSavedRainWater(int[] heights) {
		int left=0;int right=heights.length-1;
		int maxRight=0;int maxLeft=0;int rainWater=0;
		
		while(left<=right) {
			if(heights[left]<=heights[right]) {
				if(heights[left]>maxLeft) {
					maxLeft=heights[left];
				}else {
					rainWater += maxLeft-heights[left];
					left++;
				}
			}else {
				if(heights[right]>maxRight) {
					maxRight=heights[right];
				}else {
					rainWater += maxRight-heights[right];
					right--;
				}
			}
		}
		
		return rainWater;
	}

}
