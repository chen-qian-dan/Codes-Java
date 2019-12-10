package tutorial1;

public class StudentDemo {

	public static void main(String[] args) {
		Student oJoe = new Student("Bill"); 
		Student oBill = new Student("Bill"); 
		Student oTim = new Student("Tim"); 
		
		System.out.println(oJoe.equals(oBill));

	}

}
