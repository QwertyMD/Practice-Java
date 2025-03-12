package tutorial03;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}

public class task05 {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        System.out.println("Sum of two integers: " + mathOps.add(5, 10));
        System.out.println("Sum of two doubles: " + mathOps.add(5.5, 10.5));
        System.out.println("Sum of three integers: " + mathOps.add(5, 10, 15));
    }
}