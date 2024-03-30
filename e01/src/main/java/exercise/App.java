package exercise;


public class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Triangle t = new Triangle(2,3);
        Circle c = new Circle(3);

        c.calculateArea();
        t.calculateArea();
    }
}

abstract class Shape {
    abstract double calculateArea();
}


class Triangle extends Shape {
    double base;
    double height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    double calculateArea() {
        return 0.5 * this.base * this.height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}


