package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	
	private static double length;
	private static double width;
	private static double perimeter;
	private static double area;
	
	public rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		this.area = getArea();
		this.perimeter = getPerimeter();
	}
	
	//doens't need method
	public static double getArea() {
		area = length * width;
		return area;
	}
	
	public static double getPerimeter() {
		perimeter = (2*length) + (2*width);
		return perimeter;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
		
	public static boolean isSquare() {
		boolean square = false;
		if (length == width) {
		square = true;
	}
		return square;

	}
	
	
	//cannot refer to instance variables in main methods.
	public static void main(String[] args) {
		rectangle one = new rectangle(0.1,0.2);
		StdDraw.setPenColor(255,0,255);
		boolean square = isSquare();
		StdDraw.filledRectangle(0.5,0.5,length,width); 
		StdDraw.setPenColor(0,0, 0);
		StdDraw.text(0.5,  0.97, "" + area);
		StdDraw.text(0.5,  0.90, "" + perimeter);
		StdDraw.text(0.5,  0.83, "" + square);




	}

}
