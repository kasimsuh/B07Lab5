package lab5;

import lab5.Point;

public class Triangle {
	Point A;
	Point B;
	Point C;
	
	public Triangle(Point A, Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(A);
	}
	
	public boolean isEquilateral() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCA = C.distance(A);
		// use an epsilon when comparing doubles
		double eps = 1e-9;
		return Math.abs(dAB - dBC) < eps && Math.abs(dBC - dCA) < eps;
	}
}
