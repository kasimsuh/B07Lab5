package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void testCircumference() {
        Point p1 = new Point(5, 5);
        Circle c1 = new Circle(p1, 2.0);
        assertEquals(2*Math.PI*2.0, c1.getCircumference());
    }

    @Test
    void testCircumference2() {
        Point p1 = new Point(0, 0);
        Circle c1 = new Circle(p1, 1.0);
        assertEquals(2*Math.PI*1.0, c1.getCircumference());
    }

    @Test
    void testArea() {
        Point p1 = new Point(3, 3);
        Circle c1 = new Circle(p1, 4.0);
        assertEquals(Math.PI * 16.0, c1.getArea());
    }

    @Test
    void testArea2() {
        Point p1 = new Point(2, 2);
        Circle c1 = new Circle(p1, 3.0);
        assertEquals(Math.PI * 9.0, c1.getArea());
    }

    @Test
    void testContainsPointTrue() {
        Point p1 = new Point(2, 2);
        Circle c1 = new Circle(p1, 3.0);
        Point test = new Point(3, 4);
        assertTrue(c1.containsPoint(test));
    }

    @Test
    void testContainsPointFalse() {
        Point p1 = new Point(0, 0);
        Circle c1 = new Circle(p1, 2.0);
        Point test = new Point(5, 5);
        assertFalse(c1.containsPoint(test));
    }

    @Test
    void testScaleEquals() {
        Point p1 = new Point(2, 2);
        Circle c1 = new Circle(p1, 3.0);
        Circle c2 = c1.scale(2.0);
        assertEquals(c1.radius*2.0, c2.radius);
    }

}