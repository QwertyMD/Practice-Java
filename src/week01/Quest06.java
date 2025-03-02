package week01;

import java.util.Scanner;

public class Quest06 {
    double length, area;

    public static void main(String[] args) {
        Quest06 mainInstance = new Quest06();
        System.out.println("Area of square");
        System.out.println(" ");
        mainInstance.readSide();
        System.out.println(" ");
        mainInstance.printArea();
    }

    public void readSide() {
        Scanner side = new Scanner(System.in);
        System.out.println("Enter side: ");
        length = side.nextDouble();
    }

    public void printArea() {
        area = Math.pow(length, 2);
        System.out.println("The area of the square is: " + area);
    }
}
