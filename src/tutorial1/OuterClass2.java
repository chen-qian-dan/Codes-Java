


package tutorial1;

public class OuterClass2 
{
	
	public void inner()
	{
		class InnerClass
		{
			public void display()
			{
				System.out.println("Inner class."); 
			}
		}
		
		InnerClass in = new InnerClass(); 
		in.display(); 
	}
	
	

}
