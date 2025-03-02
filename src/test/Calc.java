package test;
import java.util.Scanner;

public class Calc {
    int fNum;
    int sNum;
    Scanner myObj = new Scanner(System.in);

    public void readNums() {
        System.out.println("Enter first number: ");
        fNum = myObj.nextInt();
        System.out.println("Enter second number: ");
        sNum = myObj.nextInt();
    }

    public void Sum() {
        System.out.println("The sum is: " + (fNum + sNum));
    }

    public void Difference() {
        System.out.println("The difference is: " + (fNum - sNum));
    }

    public void Product() {
        System.out.println("The product is: " + (fNum * sNum));
    }

    public void Quotient() {
        System.out.println("The quotient is: " + (fNum / sNum));
    }

    public void Remainder() {
        System.out.println("The remainder is: " + (fNum % sNum));
    }
}
