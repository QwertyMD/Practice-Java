package tutorial04;

class AreaCalculator {
    public void calculateArea(int length, int width) {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    public void calculateArea(int length) {
        int area = length * length;
        System.out.println("Area of square: " + area);
    }

    public void calculateArea(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}

public class quest14 {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        calc.calculateArea(5, 10);
        calc.calculateArea(7);
        calc.calculateArea(3.0, 7.0);
    }
}
