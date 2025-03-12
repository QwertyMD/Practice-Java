package workshop02;

import java.util.Scanner;

public class quest11 {
    int num, i, fact = 1;

    public static void main(String[] args) {
        quest11 mainInstance = new quest11();
        mainInstance.readNum();
        mainInstance.printFact();
    }

    public void readNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        scanner.close();
    }

    public void printFact() {
        for (i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + ": " + fact);
    }
}