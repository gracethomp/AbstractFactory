package com.company.factory;

import com.company.Point;
import com.company.shapes.triangle.Triangle;
import com.company.shapes.triangle.WhiteTriangle;

public class WhiteFactory implements BaseFactory {

    @Override
    public void createCircle() {

    }

    @Override
    public Triangle createTriangle(Point a, Point b, Point c) {
        return new WhiteTriangle(a, b, c);
    }
}
