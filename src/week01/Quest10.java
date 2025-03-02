package week01;

import java.util.Scanner;

public class Quest10 {
    int firstNum, secondNum;
    int sum, difference, product, quotient, remainder;

    public static void main(String[] args) {
        Quest10 mainInstance = new Quest10();
        mainInstance.readNums();
        System.out.println(" ");
        mainInstance.printCalc();
    }

    public void readNums() {
        Scanner nums = new Scanner(System.in);
        System.out.println("Enter first number: ");
        firstNum = nums.nextInt();
        System.out.println("Enter second number: ");
        secondNum = nums.nextInt();
    }

    public void printCalc() {
        sum = firstNum + secondNum;
        difference = firstNum - secondNum;
        product = firstNum * secondNum;
        quotient = firstNum / secondNum;
        remainder = firstNum % secondNum;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
