package workshop01;

import java.util.Scanner;

public class quest04 {
    float first_side, second_side, third_side, semi_peri, area;

    public static void main(String[] args) {
        quest04 mainInstance = new quest04();
        System.out.println("Area of triangle");
        System.out.println(" ");
        mainInstance.readSides();
        System.out.println(" ");
        mainInstance.printArea();
    }

    public void readSides() {
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter first side: ");
        first_side = sides.nextFloat();
        System.out.println("Enter second side: ");
        second_side = sides.nextFloat();
        System.out.println("Enter third side: ");
        third_side = sides.nextFloat();
        sides.close();
    }

    public void printArea() {
        semi_peri = (first_side + second_side + third_side) / 2;
        area = (float) Math.sqrt(semi_peri * (semi_peri - first_side) * (semi_peri - second_side) * (semi_peri - third_side));
        System.out.println("The area of the triangle is: " + String.format("%.2f", area));
    }
}
