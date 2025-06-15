import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Shape circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());

        scanner.close();
    }
}