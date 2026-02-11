package edu.cmu.cs.cs214.lab02;

import java.util.Scanner;
import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

           

            Shape s1 = new Rectangle(4, 6);
            Shape s2 = new Circle(5);
            Shape s3 = new Square(6);

            new Renderer(s1).draw();
            new Renderer(s2).draw();
            new Renderer(s3).draw();
        }
    }
}