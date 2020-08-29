package com.anik.cts.overloading;

public class Shapes {

	public void calculateArea(double radius)
	{
		double area = 3.14*Math.pow(radius, 2);
		System.out.println("Area of the circle is: "+area);
	}
	
	public void calculateArea(double length , double breadth)
	{
		double area = length*breadth;
		System.out.println("Area of the rectangle is: "+area);
	}
	
	public void calculateArea(int side)
	{
		int area = (int) Math.pow(side, 2);
		System.out.println("The area of the square: "+area);
	}
}
