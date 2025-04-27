package workshop09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
    String firstName, lastName, address, contactNumber, semester;

    public Student(String firstName, String lastName, String address, String contactNumber, String semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + address + "," + contactNumber + "," + semester;
    }
}

public class quest02_05 {
    public static void main(String[] args) {
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/workshop09/student.csv"));
        ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Address: ");
            String address = scanner.nextLine();
            System.out.println("Contact Number: ");
            String contactNumber = scanner.nextLine();
            System.out.println("Semester: ");
            String semester = scanner.nextLine();

            Student student = new Student(firstName, lastName, address, contactNumber, semester);
            writer.write(student.toString());
            System.out.println("Written to student.csv");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
