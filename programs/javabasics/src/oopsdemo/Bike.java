package oopsdemo;

public class Bike extends Vehicle{

	public Bike(String regno, String owner, String color, int speed) {
		super(regno, owner, color, speed);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Method override
	 */
	@Override
	public void move() {
		this.speed = this.speed +20;
		System.out.println("Bike Moved : current speed is "+this.speed);
	}

}
