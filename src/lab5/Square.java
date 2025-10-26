package lab5;

import lab5.Point;

public class Square {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		double side = A.distance(B);
	    return 4 * side;
	}
	
	public double area() {
		double side = A.distance(B);
	    return side * side;
	}
}
