package workshop02;

import java.util.Scanner;

public class quest01 {
    float length, breadth;

    public static void main(String[] args) {
        quest01 mainInstance = new quest01();
        mainInstance.readSides();
        mainInstance.checkSquare();
    }

    public void readSides() {
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = sides.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = sides.nextFloat();
    }

    public void checkSquare() {
        if (length == breadth) {
            System.out.println("It's a square");
        } else {
            System.out.println("It's not  a square");
        }
    }
}
