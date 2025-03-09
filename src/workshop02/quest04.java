package workshop02;

import java.util.Scanner;

public class quest04 {
    int age1, age2;

    public static void main(String[] args) {
        quest04 mainInstance = new quest04();
        mainInstance.readAges();
        mainInstance.printOldestAndYoungest();
    }

    public void readAges() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of first person: ");
        age1 = scanner.nextInt();
        System.out.println("Enter age of second person: ");
        age2 = scanner.nextInt();
    }

    public void printOldestAndYoungest() {
        if (age1 > age2) {
            System.out.println("First person is oldest i.e. " + age1);
            System.out.println("Second person is youngest i.e. " + age2);
        } else if (age2 > age1) {
            System.out.println("First person is youngest i.e. " + age1);
            System.out.println("Second person is oldest i.e. " + age2);
        } else {
            System.out.println("Both are of equal age");
        }
    }
}