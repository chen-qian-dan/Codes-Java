package tutorial1;

public class Student {
	
	private String name; 
	
	public Student(String name) {
		this.name = name; 
	}

	public boolean equals(Student other) {
		
		if (other.name == this.name){
			return true; 
		}
		else {
			return false; 
		}
	}
}
