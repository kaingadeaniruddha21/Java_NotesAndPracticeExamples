package oop_shape_subclasses;



public class ShapeManageMain extends Circle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle  c= new Circle();
		c.setRadius();
		c.getArea();
		c.getRadius();
		c.getPerimeter();
		
		Square  s= new Square();
		s.setside();
		s.getAreaSquare();
		
		
		Rectangle rec = new Rectangle();
		rec.setLength();
		rec.setWidth();
		rec.getPerimeter();
		rec.getArea();
		
	}

}