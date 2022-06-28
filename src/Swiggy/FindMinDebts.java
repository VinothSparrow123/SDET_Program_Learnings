package Swiggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindMinDebts {
	/* Given the group of Debt records, who in the group has the smallest negative balance
	 * if nobody has a negative balance, return the string "Nobody has a negative balance".
	 * if multiple people has same min negative balance, return those people list with sorted order.
	 */
//	
//	@Test
//	public void data1() {
//		String[] debts = { "Alex Blake 2", "Blake Alex -2", "Casey Alex -5", "Blake Casey -77", "Alex Blake 4", "Alex Casey 54" };
//		Map<String, Integer> map = new HashMap<>();
//		int dummy = 0;
//		for (int i = 0; i < debts.length; i++) {
//			dummy = Integer.parseInt(debts[i].replaceAll("[^0-9]", ""));
//			map.put(debts[i].split("\\s")[0] + debts[i].split("\\s")[1],dummy);
//		}
//		System.out.println(findMinDebts(map));
//	}
	
	/*
	 * Pseudo Code:
	 * Split the input as Name and Debt value.
	 * declare minValue variable and a list
	 * Iterate the map using for loop
	 *  -> If value of the key is greater than minValue and lesser than 0, Add it into a map
	 *  -> If not move on
	 *  
	 * Return the list
	 * 
	 */
	
	/*
	public String findMinDebts(Map<String, Integer> map) {
		
		List<String> output = new ArrayList<>();
		int minValue = Integer.MIN_VALUE;
//		for (Entry<String, Integer> eachKeySet : map.entrySet()) {
//			if(eachKeySet.getValue() < 0 && eachKeySet.getValue() > minValue) {
//				minValue = eachKeySet.getValue(); 
//			}
//		}
		
		int min = Collections.min(map.values());
		
		if(minValue == Integer.MIN_VALUE) return "Nobody has a negative balance";
		
		for (Map.Entry<String, Integer> eachKeySet : map.entrySet()) {
			if(eachKeySet.getValue() == minValue) {
				output.add(eachKeySet.getKey()); 
			}
		}
		
		return output.toString();
		
	}
	*/
	
	@Test
	public void example1() {
		// Borrower-Lender-Amount
		String[] debts = { "Alex Blake 2", "Blake Alex 2", "Casey Alex 5", "Blake Casey 7", "Alex Blake 4",
				"Alex Casey 4" };
		List<List<String>> input = new ArrayList<>();
		
		/*
		 * for (String eachStr : debts) { List<String> list = new ArrayList<>();
		 * list.add(eachStr.split("\\s").col);
		 * Arrays.stream(eachStr.split("\\s+")).collect(Collectors.toList()); }
		 */
		for (String str : debts)
			input.add(Arrays.stream(str.split("\\s+")).collect(Collectors.toList()));

		findMinDebt(input);
	}

	private void findMinDebt(List<List<String>> input) {
		Map<String, Integer> debtCalc = new TreeMap<>();

		for (List<String> list : input) {
			debtCalc.put(list.get(0), debtCalc.getOrDefault(list.get(0), 0) - Integer.parseInt(list.get(2)));
			debtCalc.put(list.get(1), debtCalc.getOrDefault(list.get(1), 0) + Integer.parseInt(list.get(2)));
		}

		int minVal = Collections.min(debtCalc.values());
		
		if(minVal>=0)
			System.out.println("Nobody has a negative balance");
		
		List<String> output = new ArrayList<>();

		for (Map.Entry<String, Integer> mp : debtCalc.entrySet())
			if (mp.getValue() == minVal)
				output.add(mp.getKey());
		
		
		System.out.println(output);
	}

}
