package com.company.factory;

import com.company.Point;
import com.company.shapes.triangle.Triangle;

public interface BaseFactory {
    void createCircle();

    Triangle createTriangle(Point a, Point b, Point c);
}
