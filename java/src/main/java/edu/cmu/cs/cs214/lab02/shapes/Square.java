package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen;

   public Square(double sideLen) {
    if (sideLen <= 0) {
    throw new IllegalArgumentException("Sidelen must be positive");
}
        this.sideLen = sideLen;
    }
    public double getArea() {
        return sideLen * sideLen;
    }
    public double getPerimeter() {
        return 4 * sideLen; }

    public String getName() {
        return "Square";
    }
}

