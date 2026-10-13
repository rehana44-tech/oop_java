abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle(2);
        Shape s2 = new Rectangle(4, 5);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());
    }
}