package multi_level_Inheritance;




public class PythonDeveloper extends Programmer{
	
	
	String[] pyTech = {"Python","Django","React"};
	
	void viewPythonDeveloperInformation() {
		System.out.println("PythonDeveloper Details are ........");
		viewEmployeeInformation();
		System.out.println("Project Name " + projectName);
		System.out.println("Technologies used ..... ");
		for (String tech : pyTech) {
			System.out.print(tech + "\t");
		}
	}
	
	

}