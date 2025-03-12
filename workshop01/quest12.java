package workshop01;

import java.util.Scanner;

public class quest12 {
    float radius, area;

    public static void main(String[] args) {
        quest12 mainInstance = new quest12();
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
        scanner.close();
    }

    public void printArea() {
        area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.println("The area of the circle is: " + String.format("%.2f", area));
    }
}