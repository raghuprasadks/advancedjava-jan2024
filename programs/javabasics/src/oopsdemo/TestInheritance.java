package oopsdemo;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike mybike = new Bike("KA50MN6677","Raghu","Red",0);
		System.out.println(mybike);
		mybike.start();
		mybike.move();
		mybike.move();
		mybike.stop();
		
	}

}
