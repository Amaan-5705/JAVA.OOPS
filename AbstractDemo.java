import java.util.Scanner;

abstract class Shape {
    double a, b, r;

    // Constructor for Rectangle and Triangle
    Shape(double x, double y) {
        a = x;
        b = y;
    }

    // Constructor for Circle
    Shape(int rad) {
        r = rad;
    }

    abstract double printArea();
}

class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double printArea() {
        return a * b; // Area of rectangle: length * breadth
    }
}

class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }

    double printArea() {
        return 0.5 * a * b; // Area of triangle: 0.5 * base * height
    }
}

class Circle extends Shape {
    Circle(double radius) {
        super((int) radius, 0); // Only the radius is used
        this.r = radius; // Set the radius
    }

    double printArea() {
        return Math.PI * r * r; // Area of circle: π * r²
    }
}

class AbstractDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Get dimensions for Rectangle and Triangle
        System.out.println("Enter dim1:");
        double dim1 = sc.nextDouble();
        System.out.println("Enter dim2:");
        double dim2 = sc.nextDouble();
        
        // Get radius for Circle
        System.out.println("Enter radius:");
        double rad = sc.nextDouble();

        Rectangle obj1 = new Rectangle(dim1, dim2);
        Triangle obj2 = new Triangle(dim1, dim2);
        Circle obj3 = new Circle(rad);
        
        System.out.println("Area of rectangle is: " + obj1.printArea());
        System.out.println("Area of triangle is: " + obj2.printArea());
        System.out.println("Area of circle is: " + obj3.printArea());
    }
}
