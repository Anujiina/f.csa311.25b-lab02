package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius;
    
  
    public Circle(double radius) {
    if (radius <= 0) {
    throw new IllegalArgumentException("Radius must be positive");
}

            this.radius = radius;
        }
    public double getArea() {
        return Math.PI * radius * radius;
    }
        public double getPerimeter() {
        return 2 * Math.PI * radius;   
    }


    public String getName() {
        return "Circle";
    }
}
