package tutorial05;

abstract class Shape {
    public void getRectangleArea(int length, int breadth) {

    }

    public void getSquareArea(int length) {

    }

    public void getCircleArea(int radius) {

    }
}

class Area extends Shape {
    @Override
    public void getRectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    public void getSquareArea(int length) {
        int area = length * length;
        System.out.println("Area: " + area);
    }

    public void getCircleArea(int radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area: " + String.format("%.2f", area));
    }
}

public class task03 {
    public static void main(String[] args) {
        Area area = new Area();
        area.getRectangleArea(5, 6);
        area.getSquareArea(5);
        area.getCircleArea(6);
    }
}
