package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void testPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        Square s1 = new Square(A, B, C, D);
        assertEquals(8.0, s1.perimeter(), 1e-9);
    }

    @Test
    void testPerimeter2() {
        Point A = new Point(1, 1);
        Point B = new Point(1, 3);
        Point C = new Point(3, 3);
        Point D = new Point(3, 1);
        Square s2 = new Square(A, B, C, D);
        assertEquals(8.0, s2.perimeter(), 1e-9);
    }

    @Test
    void testArea() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(3, 3);
        Point D = new Point(3, 0);
        Square s3 = new Square(A, B, C, D);
        assertEquals(9.0, s3.area(), 1e-9);
    }

    @Test
    void testArea2() {
        Point A = new Point(2, 2);
        Point B = new Point(2, 5);
        Point C = new Point(5, 5);
        Point D = new Point(5, 2);
        Square s4 = new Square(A, B, C, D);
        assertEquals(9.0, s4.area(), 1e-9);
    }

    @Test
    void testIsSquareTrue() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);
        Square s5 = new Square(A, B, C, D);
        assertTrue(s5.isSquare());
    }

    @Test
    void testIsSquareFalse() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(4, 2);
        Point D = new Point(4, 0);
        Square s6 = new Square(A, B, C, D);
        assertFalse(s6.isSquare());
    }
}