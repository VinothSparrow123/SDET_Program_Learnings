package Matix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class reverseTheMatrix {
	
	    static int N = 4;
	 
	    // Function to rotate the matrix 90 degree clockwise
	    static void rotate90Clockwise(int arr[][])
	    {
	        // printing the matrix on the basis of
	        // observations made on indices.
	    	
	    	List<Integer> list=new ArrayList<>();
	    		
	    	list.add(1);
	    	list.add(2);
	    	list.add(3);
	    	list.add(4);
	    	list.remove(1);
//	    	list.ge
	    	
	        for (int j = 0; j < N; j++)
	        {
	            for (int i = N - 1; i >= 0; i--)
	                System.out.print(arr[i][j] + " ");
	            System.out.println();
	        }
	    }
	    public static void main(String[] args)
	    {
	        int arr[][] = { { 1, 2, 3, 4 },
	                        { 5, 6, 7, 8 },
	                        { 9, 10, 11, 12 },
	                        { 13, 14, 15, 16 } };
	        rotate90Clockwise(arr);
	    }
	    
//	    List<Integer> inte=new ArrayList<>()
	    //0,1 -> 3,0
	    //0,2 -> 0,2
	    
}
