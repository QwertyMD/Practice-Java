package workshop07;

import java.util.HashMap;
import java.util.Scanner;

public class Record {
    HashMap<Integer, String> students = new HashMap<>();

    public void addRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter name: ");
        String name = sc.next();
        students.put(id, name);
        System.out.println("Record added successfully");
    }

    public void viewRecord() {
        if (students.isEmpty()) {
            System.out.println("No records found");
        } else {
            for (Integer key : students.keySet()) {
                System.out.println("ID: " + key + ", Name: " + students.get(key));
            }
        }
    }

    public void updateRecord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id to update: ");
        int upId = scan.nextInt();
        if (students.containsKey(upId)) {
            System.out.println("Enter new name: ");
            String newName = scan.next();
            students.put(upId, newName);
            System.out.println("Record updated successfully");
        } else {
            System.out.println("Record not found");
        }
    }

    public void deleteRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id to delete: ");
        int delId = scanner.nextInt();
        if (students.containsKey(delId)) {
            students.remove(delId);
            System.out.println("Record deleted successfully");
        } else {
            System.out.println("Record not found");
        }
    }
}
