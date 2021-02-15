package ds.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.junit.Test;

public class GetDistinctIDs {
	@Test
	public void data1(){
		int[] input= {1,2,3,1,2,2,1};
		int m = 3;
		System.out.println(getDistinctIDS(input,m));
	}
	
	@Test
	public void data2(){
		List<Integer> input= new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(1);
		input.add(2);
		input.add(2);
		input.add(1);
		int m = 3;
		System.out.println(mindistinct(input,m));
	}

	private int getDistinctIDS(int[] input,int m) {

		Map<Integer,Integer> map=new HashMap<>();

		for(int i=0;i<input.length;i++) {
			map.put(input[i], map.getOrDefault(input[i], 0)+1);
		}

		List<Integer> list=new ArrayList<>(map.values());

		Collections.sort(list);

		for(int i=0;i<list.size();i++){
			if(m<=0) break;
			m=m-list.get(i);
			if (m-list.get(i) >=0) {
				int n=m-list.get(i);
				list.set(i, n);
			}

		}
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == 0) count++;
		}

		return list.size()-count;	
	}

	private int mindistinct(List<Integer> list,int m) {
		HashMap<Integer, Integer> sortedMap = new HashMap<>();
		for (Integer integer : list) {
			sortedMap.put(integer, sortedMap.getOrDefault(integer, 0)+1);
		}

		System.out.println(sortedMap);
		Map<Integer,Integer> map=sortedMap
				.entrySet().
				stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(o,n)->o,LinkedHashMap::new));


		for (Entry<Integer, Integer> integer : map.entrySet()) {
			if(m<=0) break;
			if(integer.getValue()==1) {
				sortedMap.remove(integer.getKey());
				m--;
			}
			else {
				if(m>=integer.getValue()) {
					m-=integer.getValue();
					sortedMap.remove(integer.getKey());
				}
				else {
					sortedMap.put(integer.getKey(), integer.getKey()-1);
					m--;
				}
			}
		}

		return sortedMap.keySet().size();

	}
}
