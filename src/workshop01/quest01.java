package workshop01;

import java.math.BigInteger;
import java.util.Scanner;

public class quest01 {
    String name;
    int age;
    BigInteger number;

    public static void main(String[] args) {
        quest01 mainInstance = new quest01();
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
        infos.close();
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Number: " + number);
    }
}
