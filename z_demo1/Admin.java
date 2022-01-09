package z_demo1;



public class Admin extends Payroll{
	String name;
	long salary;
	
	
	
	public void adjustSalary()
	{
		System.out.println("adjust Admin salary here..");
	}
	
	public void doAdminStuff()
	{
		System.out.println("Do Admin Stuff");
	}
}