






package tutorial1;

public class Dog {

	// attributes
	private String strName; 
	private int nAge;
	
	protected static int count = 0; 
	
	// default constructor
	public Dog()
	{
		
	}
	
	// customed constructor
	public Dog(String strName, int nAge)
	{
		this.strName = strName; 
		this.nAge = nAge; 		
	}
	
	public void speak()
	{
		System.out.println("I am " + strName + " and I am " + nAge + " old."); 
	}

}









