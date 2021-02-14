package ProblemsSolved;

import org.junit.Test;

public class windowSliding_max1s { //to be solved as a homework


	/*Given an array A of 0s and 1s, you are allowed to change K values from 0 to 1.
		Return the length of the longest (contiguous) subarray that contains only 1s. 
		Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
		Output: 6
		Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
		Output: 10
	 * 
	 */

	/*
	 * Using sliding technique, slide through each position by initializing i and j
	 * Compare current value equals to 1
	 * if yes continue by increasing j value
	 * if no count++ (count should not exceed k integer)
	 * if K exceed, maxcount = currentlength
	 * 		assign i=j;


	 * int i=0,int j=i+1, count=0
	 * for 
	 * 	if(i!=1)
	 * 	input[i]=1;
	 * 	count++;
	 * 
	 * if(count=k){
	 * 	maxCount=i,j -> array lenth to return j-i+1
	 * 	find the max between count, maxCount
	 * }
	 * 
	 * else{}
	 * 
	 */

	@Test
	public void data1() {
		int[] input= {0,1,1,0,0,1,1,1,1,0,0};
		int k=2;
		returnMaxContinguos(input,k);
	}

	@Test
	public void data2() {
		int[] input= {0,1,1,1,1,1,0,1,1,1,1,1,0,0};
		int k=2;
		returnMaxContinguos(input,k);
	}

	@Test
	public void data3() {
		int[] input= {1,1,1,1,1,1,1,1,1,1};
		int k=2;
		returnMaxContinguos(input,k);
	}
	
//	@Test
//	public void data4() {
//		int[] input= {1,1,0,0,1,1};
//		int k=2;
//		System.out.println(returnMaxContinguos(input,k));
//	}
	
	@Test
	public void data5() {
		int[] input= {1,0};
		int k=2;
		System.out.println(returnMaxContinguos(input,k));
	}

	public int returnMaxContinguos(int[] input,int k) {

		int i=0;
		int count=0;int maxCount=0;
		for(int j=i;j<input.length;j++) {
			if(count<k) {
				if(input[j]==1) {
					j++;
				}else {
					input[j]=1;
					count++;
				}
			}
			maxCount=Math.max(maxCount, j-i+1);
			i++;j=i;
		}
		return maxCount;
	}

}
