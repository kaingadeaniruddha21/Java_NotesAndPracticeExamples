package z_demo1;

public class Main {

	public static void main(String[] args) {
		
		Payroll p= new Payroll();
		p.adjustSalary(5000);
		
		Academic a= new Academic();
		a.giveLecture();
		
		Academic a1 = new Academic();
		a.adjustSalary();
		
		Admin a2 = new Admin();
		a2.adjustSalary();
		
		Admin a3= new Admin();
		a3.doAdminStuff();

	}

}