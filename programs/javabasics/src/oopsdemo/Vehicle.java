package oopsdemo;

public class Vehicle {
	String regno;
	String owner;
	String color;
	int speed;
	
	public Vehicle(String regno,String owner,String color,int speed) {
		this.regno = regno;
		this.owner = owner;
		this.color = color;
		this.speed = speed;
	}
	
	public void start() {
		this.speed =0;
		System.out.println("Vehicle Started:KickStart");
	}
	
	public void move() {
		this.speed = this.speed +10;
		System.out.println("Vehicle Moved : current speed is "+this.speed);
	}

	public void stop() {
		this.speed =0;
		System.out.println("Vehicle Stopped");
	}
	
	public String toString() {
		return "Registration number "+this.regno +" Owner "+this.owner;
	}
	/**
	 * Method overload
	 * @param fuelType
	 */
	public void info(String fuelType) {
		System.out.println("fuel type "+fuelType);
		
	}
	/**
	 * Method overload
	 * @param fuelType
	 */
	public void info(String fuelType,String emission) {
		System.out.println("fuel type "+fuelType +"emission "+emission);		
	}
	
}
