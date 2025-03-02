package week01;

import java.math.BigInteger;
import java.util.Scanner;

public class Quest01 {
    String name;
    int age;
    BigInteger number;

    public static void main(String[] args) {
        Quest01 mainInstance = new Quest01();
        mainInstance.readInfo();
        System.out.println(" ");
        mainInstance.printInfo();
    }

    public void readInfo() {
        Scanner infos = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = infos.nextLine();
        System.out.println("Enter age: ");
        age = infos.nextInt();
        System.out.println("Enter number: ");
        number = infos.nextBigInteger();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
    }
}
