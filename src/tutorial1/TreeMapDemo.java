package tutorial1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// Map is similar to dictionary in Python; 
		// ordered 
		// (key, value)
		// key can be same type; 
		Map m = new TreeMap(); 
				
		m.put("tim", 5);
		m.put("Qian", "6"); 
				
		System.out.println(m);

	}

}
