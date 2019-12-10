package tutorial1;

import java.util.Arrays;

public class Array_sortArrayDemo {

	public static void main(String[] args) {
		int[] x = {-99, 3, 5, 2, 13, 45, 1, 4}; 
		
		for (int i : x)
		{
			System.out.print(i + " ");
		}
		System.out.println(); 
		 
		Arrays.sort(x, 1, 4);	
		
		for (int i : x)
		{
			System.out.print(i + " ");
		}

	}

}
