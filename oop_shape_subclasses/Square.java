package oop_shape_subclasses;

import java.util.*;

public class Square extends Rectangle {
	double side;
	void setside() {
		 System.out.println("Enter side length for square");
		  side=sc.nextDouble();
	  }
	void getside() {
		 System.out.println(" Radius ="+side);
		 
	  }
	void getAreaSquare() {
		 area=side*side;
		 System.out.println("area of square=" + area);
	}
	


}
