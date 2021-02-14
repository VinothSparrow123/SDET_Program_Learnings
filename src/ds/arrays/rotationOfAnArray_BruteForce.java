package ds.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
public class rotationOfAnArray_BruteForce 
{

	@Test
	public void example()
	{
		int[] arr = {0,8,2,3,1};
		int number = 3;
		int[] rotatedArray = numberRotate(arr, number);
		System.out.println(Arrays.toString(rotatedArray));
	}

	@Test
	public void example1()
	{
		int[] arr = {0,1,2,3,4};
		int number = 3;
		int[] rotatedArray = numberRotate(arr, number);
		System.out.println(Arrays.toString(rotatedArray));
	}

	@Test
	public void example2()
	{
		int[] arr = {0,0,10,3,-4};
		int number = 3;
		int[] rotatedArray = numberRotate(arr, number);
		System.out.println(Arrays.toString(rotatedArray));
	}

	private int[] numberRotate(int[] arr, int number)
	{

		ArrayList<Integer> output=new ArrayList<>();

		int[] arrayRotation= new int[arr.length];
		int ele=arr.length-number;

		if(number>arr.length) {
			ele=arr.length-(number % arr.length); //O[1]
		}

		int i=0;
		for(int j=ele;j<arr.length;j++) {
			arrayRotation[i]=arr[j]; //O[N]
			i++;
		}

		for(int k=0;k<ele;k++) {
			arrayRotation[i]=arr[k]; //O[N]
			i++;
		}

		return arrayRotation;
	}
	//Time Complexity of the solution is O[N}
}