import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Ignore;

public class TriangleTest {

    
    public void equilateralTrianglesHaveEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(2, 2, 2);

        assertTrue(triangle.isEquilateral());
    }

    
    public void trianglesWithOneUnequalSideAreNotEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 2);

        assertFalse(triangle.isEquilateral());
    }

    
    public void trianglesWithNoEqualSidesAreNotEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);

        assertFalse(triangle.isEquilateral());
    }

    
    public void trianglesWithNoSizeAreIllegal() {
        assertThrows(
            TriangleException.class,
            () -> new Triangle(0, 0, 0));
    }

    
    public void verySmallTrianglesCanBeEquilateral() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.5, 0.5);

        assertTrue(triangle.isEquilateral());
    }

    
    public void isoscelesTrianglesHaveLastTwoSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(3, 4, 4);

        assertTrue(triangle.isIsosceles());
    }

    
    public void isoscelesTrianglesHaveTwoFirstSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);

        assertTrue(triangle.isIsosceles());
    }

    
    public void isoscelesTrianglesHaveFirstAndLastSidesEqual() throws TriangleException {
        Triangle triangle = new Triangle(4, 3, 4);

        assertTrue(triangle.isIsosceles());
    }

    
    public void equilateralTrianglesAreAlsoIsosceles() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 4);

        assertTrue(triangle.isIsosceles());
    }

    
    public void noSidesAreEqualCantBeIsoceles() throws TriangleException {
        Triangle triangle = new Triangle(2, 3, 4);

        assertFalse(triangle.isIsosceles());
    }

    
    public void firstTriangleInequalityViolation() {
        assertThrows(
            TriangleException.class,
            () -> new Triangle(1, 1, 3));
    }
    
    
    public void secondTriangleInequalityViolation() {
        assertThrows(
            TriangleException.class,
            () -> new Triangle(1, 3, 1));
    }
    
    
    public void thirdTriangleInequalityViolation() {
        assertThrows(
            TriangleException.class,
            () -> new Triangle(3, 1, 1));
    }

    
    public void verySmallTrianglesCanBeIsosceles() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.4, 0.5);

        assertTrue(triangle.isIsosceles());
    }

    
    public void scaleneTrianglesHaveNoEqualSides() throws TriangleException {
        Triangle triangle = new Triangle(5, 4, 6);

        assertTrue(triangle.isScalene());
    }

    
    public void allSidesEqualAreNotScalene() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 4);

        assertFalse(triangle.isScalene());
    }

    
    public void twoSidesEqualAreNotScalene() throws TriangleException {
        Triangle triangle = new Triangle(4, 4, 3);

        assertFalse(triangle.isScalene());
    }

    
    public void mayNotViolateTriangleInequality() {
        assertThrows(
            TriangleException.class,
            () -> new Triangle(7, 3, 2));
    }

    
    public void verySmallTrianglesCanBeScalene() throws TriangleException {
        Triangle triangle = new Triangle(0.5, 0.4, 0.6);

        assertTrue(triangle.isScalene());
    }
}
