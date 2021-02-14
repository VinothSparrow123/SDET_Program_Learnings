import org.junit.Test;

public class SecondMaxSum {

	//	int[] [95, -27, -18, 0, 9, 45, -12]
	//			any two elements

	/*Pseudo code
	 * Declare the variables: max and currMax and secondMax
	 * 
	 * Two for loops: i=0, j=i+1, j<length
	 * 
	 * if (max<currMax)
	 * if(secondMax<currMax<
	 * 	max=currMax
	 * 
	 * Hold first and add it with next elements
	 * Math.max
	 * 
	 */

	/*
	 * 
	 */

	@Test
	public void data1() {
		int[] input= {95, -27, -18, 0, 9, 45, -12};
		System.out.println(getSecondMax(input));
	}

	@Test
	public void data2() {
		int[] input= {12,12,12,1,10,10};
		System.out.println(getSecondMax(input));
	}

	@Test
	public void data3() {
		int[] input= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(getSecondMax(input));
	}

	//	private int getSecondMax(int[] input) {
	//		int max=0;int currMax=0;int secondMax=0;
	//		int left=0;int right=0;
	//		while(left<input.length) {
	//			currMax=input[left]+input[right];
	//			if()
	//			max=Math.max(max, currMax);
	//			right++;
	//		}
	//
	//	
	//		return secondMax;
	//	}
	private int getSecondMax(int[] input) {

		if(input.length<2) {
			return -1;
		}

		int max=0;int currMax=0;int secondMax=0;
		for(int i=0;i<input.length-1;i++) {
			for(int j=i+1;j<input.length;j++) {
				currMax=input[i]+input[j];
				if(max>currMax && currMax>secondMax) {
					secondMax=currMax;
				}
				if(max<currMax) {
					if(max>secondMax) {
						secondMax=max;
					}
					max=currMax;
				}

			}}
		return secondMax;
	}
}
