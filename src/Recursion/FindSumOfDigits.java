package Recursion;

import org.junit.Test;

public class FindSumOfDigits {
	@Test
	public void data1(){
		int k = 1234;
		System.out.println(getSUmOfDigits(k));
	}
	
	@Test
	public void data2(){
		int k = 9876;
		System.out.println(getSUmOfDigits(k));
	}
	
	@Test
	public void data3(){
		int k = 100000;
		System.out.println(getSUmOfDigits(k));
	}

	private int getSUmOfDigits(int k) {
		int sum=0;
		while(k>0) {
			sum += k%10;
			k=k/10;
			if(k==0 && sum<10) {
				return sum;
			}else if(k==0 && sum>=10){
				k=sum;
				sum=0;
			}
		}
		return k;
	}
}
