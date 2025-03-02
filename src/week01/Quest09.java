package week01;

import java.util.Scanner;

public class Quest09 {
    float principle, rate, time;
    double interest;

    public static void main(String[] args) {
        Quest09 mainInstance = new Quest09();
        mainInstance.readVals();
        System.out.println(" ");
        mainInstance.printInterest();
    }

    public void readVals() {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter principle: ");
        principle = values.nextFloat();
        System.out.println("Enter rate: ");
        rate = values.nextFloat();
        System.out.println("Enter time: ");
        time = values.nextFloat();
    }

    public void printInterest() {
        interest = (principle * rate * time) / 100;
        System.out.println("The simple interest is: " + interest);
    }
}