package tutorial1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> t = new HashSet<Integer>(); 
		
		t.add(5); 
		t.add(7);
		t.add(5);
		t.add(9); 
		t.add(-8); 
		
		if(t.contains(9))
		{
			System.out.println("it contains 9"); 
		}
		System.out.println(t); 

	}

}
