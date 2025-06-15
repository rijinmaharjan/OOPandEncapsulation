abstract class Draw {
    abstract double calculateVolume();
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3); 
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2); 
    }

    @Override
    double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return length * width * height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height); 
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius * 2; 
    }
}


public class DrawTest {
    public static void main(String[] args) {
        Draw cube = new Cube(5);
        Draw cuboid = new Cuboid(4, 3, 2);
        Draw cylinder = new Cylinder(3, 7);

        System.out.println("=== Cube ===");
        System.out.println("Volume: " + cube.calculateVolume());
        System.out.println("Area: " + cube.calculateArea());
        System.out.println("Perimeter: " + cube.calculatePerimeter());

        System.out.println("\n=== Cuboid ===");
        System.out.println("Volume: " + cuboid.calculateVolume());
        System.out.println("Area: " + cuboid.calculateArea());
        System.out.println("Perimeter: " + cuboid.calculatePerimeter());

        System.out.println("\n=== Cylinder ===");
        System.out.println("Volume: " + cylinder.calculateVolume());
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Perimeter (approx.): " + cylinder.calculatePerimeter());
    }
}