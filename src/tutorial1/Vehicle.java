package tutorial1;

public interface Vehicle {
	
	final int gears = 5; // final means it is a constant. 
	
	// we can only have public empty methods in an interface.
	// call the Classes inherit from this interface just like sign 
	// a contract that have to have these methods. 
	void speedUp(int a); 
	void changeGear(int a); 
	void slowDown(int a); 
	
	default void out() {
		System.out.println("Default method."); 
	}
	
	static int math(int b) {
		return b + 9; 
	}

}
