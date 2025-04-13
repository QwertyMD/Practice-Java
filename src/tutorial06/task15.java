package tutorial06;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        String alphanum = "^[a-zA-Z0-9]{6}$";
        Scanner text = new Scanner(System.in);
        System.out.println("Enter any alphanumeric character: ");
        String inp = text.next();
        if (inp.matches(alphanum)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Length must be 6 characters long");
        }
    }
}
