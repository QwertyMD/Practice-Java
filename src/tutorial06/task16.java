package tutorial06;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        String numPattern = "^[789]\\d{9}$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 digit number: ");
        String num = scanner.next();
        if (num.matches(numPattern)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Must start with 7,8 or 9");
        }
    }

}
