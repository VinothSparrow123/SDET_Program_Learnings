package ProblemsSolved;

import org.junit.Test;

public class FlowerPot {
	/*
	 * You have a long flowerbed in hich some of the plots are planted and some are not.
	 * However flowers cannot be planted in adjacen plots. Given an integer arrayflowerbed containing 
	 * 0's and 1's,
	 * where 0 means empty and 1 means not empty and an integer n, return if n new flowers can be
	 * planted in the flowerbed without violating no=adjacent-flowers rule. 
	 * 
	 * Example 1:
	 * input: flowerbed={1,0,0,0,1}, n=1
	 * Output = true
	 */
	
	@Test
	public void data1() {
		int[] flowerbed= {1,0,0,0,1};
		int n=1;
		System.out.println(getPlantedPlots(flowerbed,n));
	}
	
	@Test
	public void data2() {
		int[] flowerbed= {1,0,1,0,1};
		int n=3;
		System.out.println(getPlantedPlots(flowerbed,n));
	}
	
	@Test
	public void data3() {
		int[] flowerbed= {1,0,0,0,1};
		int n=3;
		System.out.println(getPlantedPlots(flowerbed,n));
	}
	
	/*Pseudo Code
	 * Declare Variable - count
	 * Get the element 1 and check adjacent element is not equal to 1
	 * 	If yes -> Increment the count
	 * 		No -> Increase the left
	 * 
	 */
	
	public boolean getPlantedPlots(int[] flowerbed,int n) {
		int count=0;
		
		int left=1;int right=2;
		
		while(right<flowerbed.length) {
			if(flowerbed[0] == 1 & flowerbed[1] != 1) count++;
			if(flowerbed[left]== 1 && flowerbed[right] != 1 & flowerbed[left-1] != 1) {
				count++;
			}
			if(flowerbed[flowerbed.length-1] ==1 & flowerbed[flowerbed.length-2] !=1) count++;
			left++;right++;
		}
		
		if(count >= n) return true;
		
		return false;
	}
}
