package tutorial1;

import java.util.Arrays;
import java.util.Collections;

public class Array_sortArrayDescendingOrderDemo {

	public static void main(String[] args) {
		// Note that we have Integer here instead of 
	    // int[] as Collections.reverseOrder doesn't
		// work for primitive types; 
		Integer[] x = {-99, 3, 5, 2, 13, 45, 1, 4}; 
						
		for (int i : x)
		{
			System.out.print(i + " ");
		}
		System.out.println(); 
				 
		Arrays.sort(x, Collections.reverseOrder());	
				
		for (int i : x)
		{
			System.out.print(i + " ");
		}

	}

}
