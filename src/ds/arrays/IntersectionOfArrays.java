package ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfArrays {
	public static void main(String[] args) {
		int[] a= {1,1,2,3,4,5,6,7};
		int[] b= {2,5,7};
		int[] c= {5,6,7};
		int[] d= {5,7};
		int[] e= {7};
		List<int[]> inputlist=Arrays.asList(a,b,c,d,e);
		System.out.println(findIntersection(inputlist));
	}
	
	/* Pseudo Code
	 * 
	 * Find the intersection of two arrays and store it in a list
	 * If the input arrays is more than 2, find the intersection of list and next array
	 * Continue until the arrays count
	 */
	
	public static List<Integer> findIntersection(List<int[]> inputList) {
		
		List<Integer> intersect=findIntersectionOfArray(inputList.get(0),inputList.get(1));
				
		for (int i = 2; i < inputList.size(); i++) {
			int[] temp=new int[intersect.size()];
			for (int j = 0; j < intersect.size(); j++) {
				temp[j]=intersect.get(j);
			}
			intersect = findIntersectionOfArray(inputList.get(i),temp);
		}
		return intersect;
	}
	
	public static List<Integer> findIntersectionOfArray(int[] a,int[] b) {
		List<Integer> list = new ArrayList<>();
		int left1=0;
		while(left1 < a.length) {
			for (int i = 0; i < b.length;i++) {
				if(a[left1] == b[i]) {
					list.add(a[left1]);
				}
			}
			left1++;
		}
		return list;
	}
	
//	public static int[] findIntersectionusingset(int[] a,int[] b) {
//		Set<Integer> s1 = new HashSet<>(Arrays.asList(a));
//		Set<Integer> s2 = new HashSet<>(Arrays.asList(b));
//		s1.retainAll(s2);
//		
//		
//	}
}
