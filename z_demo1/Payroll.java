package z_demo1;
import java.util.Scanner;

public class Payroll {

	int salary;
	
	/*
	 * public void adjustSalary() { System.out.println("adjust your salary here..");
	 * }
	 */
	
Scanner sc= new Scanner(System.in);

	public void adjustSalary(int salary) {
		this.salary=salary;
		// TODO Auto-generated method 
		
		System.out.println("adjust your salary"+salary);
		
	}
	
}