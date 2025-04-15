package workshop05;

abstract class Shape {
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("This is area of quadrilateral");
    }

    public void calculatePerimeter() {
        System.out.println("This is perimeter of quadrilateral");
    }
}

public class quest01_02_03_04 {
    public static void main(String[] args) {
        Quadrilateral quad = new Quadrilateral();
        quad.calculateArea();
        quad.calculatePerimeter();
    }
}
