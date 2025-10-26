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
	
	public boolean isSquare() {
        double sideAB = A.distance(B);
        double sideBC = B.distance(C);
        double sideCD = C.distance(D);
        double sideDA = D.distance(A);
        double eps = 1e-9;
        return Math.abs(sideAB - sideBC) < eps &&
               Math.abs(sideBC - sideCD) < eps &&
               Math.abs(sideCD - sideDA) < eps;
    }
}
