package FirstAssessment;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class largestString {
	
	/*
	 * Given a string, construct a new string by rearranging the original string
		and deleting characters as needed. Return the alphabetically largest
		string that can be constructed respecting a limit as to how many
		consecutive characters can be the same.
		Example
		s = 'baccc'
		k = 2
		
		Output: ccba
	 */
	
	@Test
	public void data1() {
		String input="appllleeee";
		System.out.println(getLargestString(input));
	}
	
	/*Approach
	 * Convert the input string into an array
	 * Store the key and its occurance value into the map
	 * Then frame the string using k value
	 * If the key value exceeds more than k, try to add after the next characters
	 * 	If there are no next characters dont add those excess count of characters
	 */
	
	private String getLargestString(String input) {
		char[] inpArr=input.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for (int i = 0; i < inpArr.length; i++) {
			map.put(inpArr[i], map.getOrDefault(inpArr, 0)+1);
		}
		
		
		
		return input;
	}
/* lakshmi bro solution:
public static String getLargestString(String s, int k) {
    // Write your code here
    StringBuilder sb = new StringBuilder();
    char[] charr= s.toCharArray();
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    for (char c : charr) {
        map.put(c, map.getOrDefault(c,0)+1);
    }
    
    Character[] keychars= new Character[map.keySet().size()];
    map.keySet().toArray(keychars);
    Arrays.sort(keychars);
    int add=0;
    for(int i=keychars.length-1;i>=0;i--){
        add=0;
        if(map.get(keychars[i])!=0){
            
            while(map.get(keychars[i])!=0){
                if(add%k==0 && add!=0){
                    int temp=1;
                    while(i-temp>=0){
                        if(map.get(keychars[i-temp])>0){
                            sb.append(keychars[i-temp]);
                            map.put(keychars[i-temp],map.get(keychars[i-temp])-1);
                            break;
                        }
                        else{
                            temp++;
                        }
                    }
                    if(i-temp<0){
                        map.put(keychars[i],0);
                        break;
                    }
                }
                sb.append(keychars[i]);
                add++;
                map.put(keychars[i],map.get(keychars[i])-1);
            }
        }
    }    
    return sb.toString();

    }
*/

/*Sooraj Solution:
class Result {

    /*
     * Complete the 'getLargestString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String getLargestString(String s, int k) {
    // Write your code here
    
    int[] cCount = new int[26];
    
    char[] cArr = s.toCharArray();
    
    for(Character c: cArr){
        cCount[c - 'a']++;
    }
    
    StringBuilder sb = new StringBuilder();
    int i = cCount.length-1;
    while(i>=0){
        if(cCount[i]==k){
            while(cCount[i]>0){
                sb.append((char)(i+'a'));
                cCount[i]--;
            }
        } else if(cCount[i]>k){
            int f = k;
            while(f>0){
                sb.append((char)(i+'a'));
                f--;
            }
            cCount[i]-=k;
            
            int j=i-1;
            while(j>0 && cCount[j]==0){
                j--;
            }
            if(cCount[j]>0 && j>=0){
                    sb.append((char) (j+'a'));
                    cCount[j]--;
                }
                else{
                    break;
                }
        } else if(cCount[i]>0) {
            while(cCount[i]>0){
                sb.append((char)(i+'a'));
                cCount[i]--;
            }
            
        }else{
            i--;
        }
        
    }
    
    return sb.toString();
    

    }

}
*/

}
