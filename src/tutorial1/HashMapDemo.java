


package tutorial1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// Map is similar to dictionary in Python; 
		// no order; 
		// (key, value)
		// key can be different type; 
		Map m = new HashMap(); 
				
		m.put("tim", 5);
		m.put(11, "Qian"); 
				
		System.out.println(m); 

	}

}
