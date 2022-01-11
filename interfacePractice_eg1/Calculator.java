package interfacePractice_eg1;



public class Calculator {

	static int a,b;
	public static void main(String[] args) {
		ArithmeticImplementation ao = new ArithmeticImplementation();

			System.out.println("Enter the value of a");
			a = ArithmeticOperation.readDataValue();
			System.out.println("Enter the value of b");
			b = ArithmeticOperation.readDataValue();
			System.out.println("addition = " +ao.add(a, b));
			ao.display();
			

	}

}