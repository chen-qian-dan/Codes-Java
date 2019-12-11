package tutorial1;

public class Car implements Vehicle{

	private int gear = 1; 
	private int speed = 0; 
	
	@Override
	public void speedUp(int gear) {
		this.gear = gear; 	
	}

	@Override
	public void changeGear(int change) {
		this.speed += change; 	
	}

	@Override
	public void slowDown(int change) {
		this.speed -= change;
	}

	public void display() {
		System.out.println("I am a car, going " + this.speed + " km/h and I am in gear " + this.gear); 
		
		out(); 
	}
}
