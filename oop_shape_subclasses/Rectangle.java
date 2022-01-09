package oop_shape_subclasses;

public class Rectangle extends Shape {
	double width,length,p,area;
	
	void setWidth() {
		 System.out.println("Enter width for rectamgle");
		  width=sc.nextDouble();
	  }
	void getWidth() {
		 System.out.println(" Radius ="+width);
		 
	  }
	void setLength() {
		 System.out.println("Enter Length for rectangle");
		 length=sc.nextDouble();
	  }
	void getLength() {
		 System.out.println(" Radius ="+length);
		 
	  }
	void getArea() {
		area=(length*width)/2;
		 System.out.println(" Area of Rectangle  ="+area);
		 
	  }
	void getPerimeter() {
		p=2*(length*width);
		 System.out.println(" Perimeter of Rectangle ="+p);
		 
	  }
}
