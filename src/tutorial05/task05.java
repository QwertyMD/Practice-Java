package tutorial05;

interface Shapes {
    void calculateArea();
}

class Circle implements Shapes {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + String.format("%.2f", area));
    }
}

class Rectangle implements Shapes {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        int area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class task05 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 6);
        circle.calculateArea();
        rectangle.calculateArea();

    }
}
