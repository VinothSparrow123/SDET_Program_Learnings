package ds.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.junit.Test;

public class MostCommonWord {

	@Test
	public void data1() {
		String paragraph="Vinoth is a good guy. $Because Vinoth! is a naughty-boy";
		String[] banned= {"Vinoth","guy","is"};
		mostCommonWord(paragraph,banned);
	}

	public String mostCommonWord(String paragraph, String[] banned) {

		String[] input=paragraph.replaceAll("[^0-9A-Za-z]"," ").toLowerCase().split("\\s+");
		Map<String,Integer> map=new HashMap<>();
		System.out.println(Arrays.toString(input));
		List<String> ban=new ArrayList<>(Arrays.asList(banned));

		int max=0;

		for(int i=0;i<input.length;i++){
			if(!ban.contains(input[i])){
				map.put(input[i],map.getOrDefault(input[i],0)+1);
				max=Math.max(max,map.get(input[i]));
				// if(map.get(arr[i])>max){
				// max = map.get(arr[i]);
				// output = arr[i];
			}
		}

		// for(String str:banned){
		//     if(map.containsKey(str)){
		//         map.remove(str);
		//     }
		// }

		PriorityQueue<String> string=new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
		string.addAll(map.keySet());

		// String s="";
		// for(int j=0;j<input.length;j++){
		//     if(map.containsKey(input[j]) && map.get(input[j])==max){
		//         s=input[j];
		//         break;
		//     }
		// }

		return string.poll();
	}

}
