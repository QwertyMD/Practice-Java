package workshop02;

import java.util.Scanner;

public class quest03 {
    int marks;

    public static void main(String[] args) {
        quest03 mainInstance = new quest03();
        mainInstance.readMarks();
        mainInstance.printGrade();
    }

    public void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        marks = scanner.nextInt();
        scanner.close();
    }

    public void printGrade() {
        if (marks >= 40 && marks < 50) {
            System.out.println("Grade: C");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade: C+");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade: B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade: B+");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade: A");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else {
            System.out.println("Fail");
        }
    }
}