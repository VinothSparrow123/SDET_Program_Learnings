package ds.arrays;

public class MinDistance {
	/*
	 * Given an input array and two unique numbers, find the smallest distance between those 2 numbers
   		Example:a
   
   		Input1: [5,6,8,1,9,1,4,1] Input2: 8,1 Output: 2
      a) If there are no occurances of the unique numbers, then throw exception
      b) If there are multiple matches, the least distance should be considered
	 */
	
	public static void main(String[] args) {
		int[] input= {5,6,8,1,9,1,4,1};
		System.out.println(findMinDistanceWithW(input,8,1));
	}

	private static int findMinDistanceWithW(int[] input, int i, int j) {
		// TODO Auto-generated method stub
		int start=0;
		for (int j2 = 0; j2 < input.length; j2++) {
			if(input[j2] == i) {
				start = j2;
				break;
			}
		}
		
		int min=0;
		
		for (int k = start+1; k < input.length; k++) {
			if(input[k] == j) {
				min = k-start;
				break;
			}
		}
		
		return min;
	}

	private static int findMinDistance(int[] input, int i, int j) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = input.length-1;
		int minDis = 0;
		while (left<right) {
			if(input[left] == i && input[right] == j) {
				if(minDis == 0) {
					minDis = right-left;
				}else {
					minDis = Math.min(right-left, minDis);
				}
				right--;
			}else if(input[left] == i) {
				right--;
			}else if(input[right] == j) {
				left++;
			}
		}
		return minDis;
	}
}
