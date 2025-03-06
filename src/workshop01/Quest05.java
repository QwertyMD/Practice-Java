package workshop01;

import java.util.Scanner;

public class Quest05 {
    float length, breadth, perimeter;

    public static void main(String[] args) {
        Quest05 mainInstance = new Quest05();
        System.out.println("Perimeter of rectangle");
        System.out.println(" ");
        mainInstance.readSides();
        System.out.println(" ");
        mainInstance.printPerimeter();
    }

    public void readSides() {
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sides.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = sides.nextFloat();
    }

    public void printPerimeter() {
        perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of rectangle is: " + String.format("%.2f", perimeter));
    }
}
