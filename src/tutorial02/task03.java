package tutorial02;

import java.util.Scanner;

public class task03 {
    int number;

    public static void main(String[] args) {
        task03 mainInstance = new task03();
        mainInstance.readNumber();
        mainInstance.checkDivisibility();
    }

    public void readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();
    }

    public void checkDivisibility() {
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is divisible by both 5 and 11.");
        } else {
            System.out.println(number + " is not divisible by both 5 and 11.");
        }
    }
}