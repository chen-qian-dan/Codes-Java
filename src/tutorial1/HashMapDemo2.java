package tutorial1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map m = new HashMap(); 
		m.put("time", 5); 
		m.put("joe", "x"); 
		m.put("a", "b"); 
		
		System.out.println(m);
		System.out.println(m.keySet());
		System.out.println(m.values());
	}

}
