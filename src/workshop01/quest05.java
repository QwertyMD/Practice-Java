package workshop01;

import java.util.Scanner;

public class quest05 {
    float length, breadth, perimeter;

    public static void main(String[] args) {
        quest05 mainInstance = new quest05();
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
        sides.close();
    }

    public void printPerimeter() {
        perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of rectangle is: " + String.format("%.2f", perimeter));
    }
}
