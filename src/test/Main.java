package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Calc numberClass = new Calc();
        numberClass.readNums();
        numberClass.Sum();
        numberClass.Difference();
        numberClass.Product();
        numberClass.Quotient();
        numberClass.Remainder();
    }
}