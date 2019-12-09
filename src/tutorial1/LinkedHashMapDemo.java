package tutorial1;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// Map is similar to dictionary in Python; 
		// original ordered 
	    // (key, value)
		// key can be different type; 
		Map m = new LinkedHashMap(); 
				
	    m.put("tim", 5);
		m.put("Qian", "6"); 
		m.put(8, "6"); 
				
		System.out.println(m); 

	}

}
