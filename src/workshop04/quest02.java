package workshop04;

class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class quest02 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Perimeter of the circle: " + String.format("%.2f", circle.getPerimeter()));
        System.out.println("Area of the circle: " + String.format("%.2f", circle.getArea()));
    }
}