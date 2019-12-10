package tutorial1;
/**
 * BlackDog is subClass / childClass / driveClass
 * Dog is superClass / parentClass
 * @author qianchen
 *
 */
public class BlackDog extends Dog
{
	// BlackDog inherits from Dog
	String size = "";
	
	// BlackDog's constructor
	public BlackDog(String name, int age) {
		super(name, age); // it means the BlackDog's constructor call Dog's constructor. 
	}
	
	// BlackDog's constructor
    public BlackDog(String name, int age, String size) {
    	super(name, age); // it means the BlackDog's constructor call Dog's constructor. 
    	this.size = size; 
	}
    
    // override super Class's method
    public void speak()
    {
    	System.out.println("I am a black dog."); 
    }

}
