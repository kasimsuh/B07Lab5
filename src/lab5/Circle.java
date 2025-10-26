package lab5;

public class Circle {

    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI  * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public boolean containsPoint(Point point) {
        double diffX = point.x - center.x;
        double diffY = point.y - center.y;
        return Math.sqrt(diffX * diffX + diffY * diffY) <= radius;
    }

    public Circle scale(double factor) {
        return new Circle(this.center, this.radius * factor);
    }
} 