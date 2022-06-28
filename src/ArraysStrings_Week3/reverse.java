package ArraysStrings_Week3;

import java.util.ArrayList;
import java.util.List;

public class reverse {
	public static void main(String[] args) {
		System.out.println(reverseWithoutSpace("vinothkumar anbazhagan"));
	}
	
	public static char[] reverseWithoutSpace(String input){
		char[] inputChar = input.toCharArray();
		int left = 0, right = input.length()-1;
		while(left < right){
			if(inputChar[left] == ' '){
				left++;
			}
			if(inputChar[right] == ' '){
				right--;
			}
			if(inputChar[left] != ' '){
				char temp = inputChar[left];
				inputChar[left] = inputChar[right];
				inputChar[right] = temp;
				left++;
				right--;
			}	
		}

		return inputChar;
	}
}
