package tutorial1;

public class FoorLoopDemo {

	public static void main(String[] args) {
		
		String[] strs = new String[3]; 
		strs[0] = "Hello"; 
		strs[1] = "Qian"; 
		strs[2] = "Chen"; 
		
		for (String str : strs)
		{
			System.out.println(str); 			
		}

	}

}
