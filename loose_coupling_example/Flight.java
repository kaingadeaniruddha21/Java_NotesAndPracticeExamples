package loose_coupling_example;



public class Flight implements Vehicle{

	@Override
	public void move() {
		System.out.println("Flight is moving....");
		
	}

}