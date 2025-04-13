package workshop04;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

public class quest07 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("5 + 8 = " + calculator.add(5, 8));
        System.out.println("10 + 15 + 20 = " + calculator.add(10, 15, 20));
        System.out.println("3.5 + 2.7 = " + calculator.add(3.5, 2.7));
        System.out.println("1.1 + 2.2 + 3.3 = " + calculator.add(1.1, 2.2, 3.3));
    }
}