package tutorial09;

import java.io.File;
import java.io.IOException;

public class task01_02_03 {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Created.");
            } else {
                System.out.println("File already exists.");
            }
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Read Permission: " + file.canRead());
            System.out.println("Write Permission: " + file.canWrite());
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("File Deleted.");
                } else {
                    System.out.println("Failed to delete.");
                }
            } else {
                System.out.println("Doesn't exist");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
