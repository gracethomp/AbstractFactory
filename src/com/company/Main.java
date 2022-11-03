package com.company;

import com.company.factory.AbstractFactory;
import com.company.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape blackCircle = AbstractFactory.getFactory(Color.BLACK).createCircle(new Point(0, 0), 10d);
        Shape whiteCircle = AbstractFactory.getFactory(Color.WHITE).createCircle(new Point(5, 10), 5d);

        Shape blackTriangle = AbstractFactory.getFactory(Color.BLACK)
                .createTriangle(new Point(0, 0), new Point(0, 5), new Point(5, 0));
        Shape whiteTriangle = AbstractFactory.getFactory(Color.WHITE)
                .createTriangle(new Point(3, 4), new Point(5, 2), new Point(6, 1));

        System.out.println("Circles\n");
        System.out.printf("Black circle: %s%n", blackCircle);
        System.out.printf("Expected area: %.2f Actual area: %.2f%n%n", 314.16, blackCircle.getArea());
        System.out.printf("White circle: %s%n", whiteCircle);
        System.out.printf("Expected perimeter: %.2f Actual perimeter: %.2f%n", 31.42, whiteCircle.getPerimeter());

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Triangles\n");
        System.out.printf("Black triangle: %s%n", blackTriangle);
        System.out.printf("Expected area: %.2f Actual area: %.2f%n%n", 111.52, blackTriangle.getArea());
        System.out.printf("White triangle: %s%n", whiteTriangle);
        System.out.printf("Expected perimeter: %.2f Actual perimeter: %.2f%n", 8.49, whiteTriangle.getPerimeter());
    }
}