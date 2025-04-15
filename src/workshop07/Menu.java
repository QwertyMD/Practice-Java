package workshop07;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("1. Add record");
        System.out.println("2. View record");
        System.out.println("3. Update record");
        System.out.println("4. Delete record");
        System.out.println("0. Exit");
        System.out.println("Choose an option: ");
    }
}
