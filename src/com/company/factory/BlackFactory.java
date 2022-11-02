package com.company.factory;

import com.company.Point;
import com.company.shapes.triangle.BlackTriangle;
import com.company.shapes.triangle.Triangle;

public class BlackFactory implements BaseFactory{

    @Override
    public void createCircle() {

    }

    @Override
    public Triangle createTriangle(Point a, Point b, Point c) {
        return new BlackTriangle(a, b, c);
    }
}
