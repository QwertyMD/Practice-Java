package workshop01;

import java.util.Scanner;

public class quest03 {
    int intNum;
    double doubleNum;
    char character;

    public static void main(String[] args) {
        quest03 mainInstance = new quest03();
        mainInstance.readVals();
        System.out.println(" ");
        mainInstance.printVals();
    }

    public void readVals() {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter integer: ");
        intNum = values.nextInt();
        System.out.println("Enter decimal: ");
        doubleNum = values.nextDouble();
        System.out.println("Enter character: ");
        character = values.next().charAt(0);
        values.close();
    }

    public void printVals() {
        System.out.println("Integer: " + intNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("Char: " + character);
    }
}
