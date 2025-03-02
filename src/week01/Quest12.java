package week01;

import java.util.Scanner;

public class Quest12 {
    float radius, area;

    public static void main(String[] args) {
        Quest12 mainInstance = new Quest12();
        System.out.println("Area of circle");
        System.out.println(" ");
        mainInstance.readRadius();
        System.out.println(" ");
        mainInstance.printArea();
    }

    public void readRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = scanner.nextFloat();
    }

    public void printArea() {
        area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.println("The area of the circle is: " + String.format("%.2f", area));
    }
}