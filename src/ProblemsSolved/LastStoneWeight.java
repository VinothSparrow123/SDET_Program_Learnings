package ProblemsSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.Test;

public class LastStoneWeight {
	
	/*
	 * We have a collection of stones, each stone has a positive integer weight.

		Each turn, we choose the two heaviest stones and smash them together.  
		Suppose the stones have weights x and y with x <= y.  The result of this smash is:
		
		If x == y, both stones are totally destroyed;
		If x != y, the stone of weight x is totally destroyed, 
		and the stone of weight y has new weight y-x.
		At the end, there is at most 1 stone left.  
		Return the weight of this stone (or 0 if there are no stones left.)
		
		 
		
		Example 1:
		
		Input: [2,7,4,1,8,1]
		Output: 1
		Explanation: 
		We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
		we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
		we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
		we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
		 
		
		Note:
		
		1 <= stones.length <= 30
		1 <= stones[i] <= 1000
	 */
	
	@Test
	public void data1() {
		int[] input= {2,7,4,1,8,1};
		System.out.println(getStoneWeight(input));
	}
	
	/* Pseudo Code
	 * 
	 * Sort the input array
	 * 
	 * Using Recursion:
	 * Get the difference between first two highest number
	 * remove one number and replace another number with difference
	 * Sort it again and do recursive action 
	 * Return the difference last 
	 * 
	 */
	

	private int getLastStoneWeight(int[] input) {
		
		List<Integer> list=new ArrayList<>();
		int stoneWeight=0;
		Arrays.sort(input);
		while (input.length >1) {
			
		}
		
		return stoneWeight;
	}
	
	private int getStoneWeight(int[] input) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder()); //logn
		
		for (Integer stone: input) {
			queue.add(stone);
		}
		
		while (queue.size() >1) { //O(n)
			int big1=queue.remove(); //o(1)
			int big2=queue.remove(); //o(1)
			if((big1 - big2) >0) {
				queue.add(big1-big2); //o(log n)
			}
		}
		
		return queue.isEmpty() ? 0:queue.peek();
	}
	
	//Time complexity: O(n logn)
}
