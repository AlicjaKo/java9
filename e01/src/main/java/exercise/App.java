package exercise;
import javax.swing.JOptionPane;

public class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Traingle t = new Traingle(2,3);
        Circle c = new Circle(3);

        c.calculateArea();
        t.calculateArea();
    }
}

abstract class Shape {
    calculateArea();
}

class Traingle extends Shape {
    double base;
    double height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }
    calculateArea() {
        System.out.println("Area: " + 0.5 * this.base * this.height);
    }
}

class Circle extends Shape {
    double radius;

    Radius(double r) {
        this.radius = r;
    }

    calculateArea() {
        System.out.println("Area: " + Math.PI * this.radius * this.radius);
    }
}