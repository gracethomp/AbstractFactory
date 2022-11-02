package com.company.factory;

import com.company.Point;
import com.company.shapes.circle.Circle;
import com.company.shapes.triangle.BlackTriangle;
import com.company.shapes.triangle.Triangle;

public class BlackFactory implements BaseFactory{

    @Override
    public Circle createCircle(Point center, Double radius) {
        return null;
    }

    @Override
    public Triangle createTriangle(Point a, Point b, Point c) {
        return new BlackTriangle(a, b, c);
    }
}
