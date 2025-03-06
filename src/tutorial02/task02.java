package tutorial02;

import java.util.Scanner;

public class task02 {
    int number;

    public static void main(String[] args) {
        task02 mainInstance = new task02();
        mainInstance.readNumber();
        mainInstance.checkEvenOrOdd();
    }

    public void readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
    }

    public void checkEvenOrOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}