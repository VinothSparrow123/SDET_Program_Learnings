package ArraysStrings_Week3;

import org.junit.Test;

public class monsterProblem {
	
	/*
	 * Monster Problem:
	 * Once upon time there was a cute princess called Farida living in a castle with her father, 
	 * mother and uncle. On the way to the castle there lived many monsters. Each one of them had 
	 * some gold coins. Although they are monsters they will not hurt. Instead they will give you 
	 * the gold coins, but if and only if you didn't take any coins from the monster directly before 
	 * the current one. To marry princess Farida you have to pass all the monsters and collect as many 
	 * coins as possible. Given the number of gold coins each monster has, calculate the maximum number 
	 * of coins you can collect on your way to the castle.
	 */
	
	@Test
	public void data1() {
		int[] input= {1,3,5,5,3,12};
		int maxCoins=getmaxCoins(input);
		System.out.println(maxCoins);
	}
	
	public int getmaxCoins(int[] input) {
		int prevMax=0;
		int currMax=0;
		
		for(int i:input) {
			int temp=currMax;
			currMax=Math.max(prevMax+i, currMax);
			prevMax=temp;
		}
		return currMax;
	}

}