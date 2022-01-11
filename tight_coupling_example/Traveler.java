package tight_coupling_example;



public class Traveler {
	
	Car c = new Car();
	
	public void startJourney() {
		c.move();
	}

}