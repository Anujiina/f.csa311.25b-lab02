package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape shape;

    public Renderer(Shape shape) {
        if (shape == null) {
            throw new IllegalArgumentException("Shape cannot be null.");
        }
        this.shape = shape;
    }

    public void draw() {
        double area = shape.getArea();
        System.out.println(shape.getName() + " printed\nIts area is " + area);
        double perimeter = shape.getPerimeter();
        System.out.println(shape.getName() + " perimeter is " + perimeter);
    }
}

