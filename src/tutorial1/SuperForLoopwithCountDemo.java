package tutorial1;

public class SuperForLoopwithCountDemo {

	public static void main(String[] args) {
		
		String[] strs = new String[3]; 
		strs[0] = "Hello"; 
		strs[1] = "Qian"; 
		strs[2] = "Chen"; 
		
		int nCount = 0; 
		for (String str : strs)
		{
			System.out.println(str); 	
			nCount++; 
		}

	}

}
