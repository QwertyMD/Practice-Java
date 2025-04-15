package tutorial06;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        String nepNum = "^(98|97)\\d{8}$";
        Scanner phone = new Scanner(System.in);
        System.out.println("Enter nepali number: ");
        String num = phone.next();
        if (num.matches(nepNum)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Not a  valid nepali number");
        }
    }
}
