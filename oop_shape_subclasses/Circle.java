package oop_shape_subclasses;


public class Circle extends Shape {
	double area, radius,p;
	double pi=3.14;
	void setRadius() {
		 System.out.println("Enter Radius of circle");
		  radius=sc.nextDouble();
	  }
	void getRadius() {
		 System.out.println(" Radius ="+radius);
		 
	  }
	void getArea() {
		area=pi*radius*radius;
		 System.out.println(" Area of circle  ="+area);
		 
	  }
	void getPerimeter() {
		p=2*pi*radius;
		 System.out.println(" Perimeter of circle ="+p);
		 
	  }
	
	}