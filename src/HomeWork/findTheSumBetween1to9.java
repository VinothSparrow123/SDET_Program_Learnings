package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class findTheSumBetween1to9 {

	/*Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
		1) Only numbers 1 through 9 are used.
		2) Each number is used at most once.
		Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
		Example 1:
		Input: k = 3, n = 7
		Output: [[1,2,4]]
		Explanation:
		1 + 2 + 4 = 7
		There are no other valid combinations.
		Example 2:
		Input: k = 3, n = 9
		Output: [[1,2,6],[1,3,5],[2,3,4]]
		Explanation:
		1 + 2 + 6 = 9
		1 + 3 + 5 = 9
		2 + 3 + 4 = 9
		There are no other valid combinations.
	 * 
	 */
	
	@Test
	public void data1() {
		int k=3;
		int n=9;
		List<List<Integer>> add = add(k,n);
		System.out.println(add);
	}


	/*Pseudo Code
	 * 
	 * Variables: k=output set size, n=target; newTarget=target; newK=k;
	 * 
	 * convert the input array to list inplis
	 *
	 * Recursion parameters: inplis, newTarget, newK
	 * if(newK >0)
	 * 	Yes -> 
	 * 
	 * 	
	 * 
	 */
	
	
	//BackTracking Appoach
	private List<List<Integer>> add (int k, int n){
		List<List<Integer>> results=new ArrayList<>();
		combination(k,n,results,new ArrayList<Integer>(),1);
		return results;
	}
	
	private List<List<Integer>> combination(int k,int n, List<List<Integer>> results,List<Integer> comb,int start){
		
		if(comb.size()==k && n==0) {
			List<Integer> lst=new ArrayList<>(comb);
			results.add(lst);
			return results;
		}
		
		
		for(int i=start;i<10;i++) {
			comb.add(i);
			combination(k,n-i,results,comb,i+1);
			comb.remove(comb.size()-1);
		}
		return null;
	}

//	private ArrayList<Integer> BFsolution(int k,int target) {
//		int index=1,newT=0;
//		Set<ArrayList<Integer>> set = new HashSet<>();
//		List<Integer> input = new ArrayList<>();
//		for (int i = 1; i < target; i++) {
//			input.add(i); //	1,2,3,4,5,6
//		}
//		
//			set.add(recursion(input,newT,k));
//	}
//
//	private ArrayList<Integer> recursion(List<Integer> input,int newT,int k){
//		while(newT>0) { //2,3,4,5,6
//			newT=target-i;
//			for(int i=1;i<target;i++){
//				newT = target - i;
//				input.remove(i);
//		}
//		return null;
//
//	}

}
