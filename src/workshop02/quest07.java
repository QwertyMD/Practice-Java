package workshop02;

import java.util.Scanner;

public class quest07 {
    int num;

    public static void main(String[] args) {
        quest07 mainInstance = new quest07();
        mainInstance.readNum();
        mainInstance.checkOddEven();
    }

    public void readNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        num = scanner.nextInt();
        scanner.close();
    }

    public void checkOddEven() {
        if (num % 2 == 0) {
            if (num % 4 == 0) {
                System.out.println(num + " is even and divisible by 4");
            } else {
                System.out.println(num + " is even but not divisible by 4");
            }
        } else {
            if (num % 7 == 0) {
                System.out.println(num + " is odd and divisible by 7");
            } else {
                System.out.println(num + " is odd but not divisible by 7");
            }
        }
    }
}