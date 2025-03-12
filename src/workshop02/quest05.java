package workshop02;

import java.util.Scanner;

public class quest05 {
    char choice;

    public static void main(String[] args) {
        quest05 mainInstance = new quest05();
        mainInstance.readCause();
        mainInstance.printEligibility();
    }

    public void readCause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a medical cause? (y/n): ");
        choice = scanner.next().charAt(0);
        choice = Character.toLowerCase(choice);
        scanner.close();
    }

    public void printEligibility() {
        if (choice == 'y') {
            System.out.println("You are not allowed to sit in the exam.");
        } else if (choice == 'n') {
            System.out.println("You can sit in the exam.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}