package workshop02;

import java.util.Scanner;

public class quest06 {
    int num;

    public static void main(String[] args) {
        quest06 mainInstance = new quest06();
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
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}