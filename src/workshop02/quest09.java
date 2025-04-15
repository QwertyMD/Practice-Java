package workshop02;

import java.util.Scanner;

public class quest09 {
    int range, i = 1, sum = 0;

    public static void main(String[] args) {
        quest09 mainInstance = new quest09();
        mainInstance.readRange();
        mainInstance.sumEvenNums();
    }

    public void readRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of even numbers: ");
        range = scanner.nextInt();
        scanner.close();
    }

    public void sumEvenNums() {
        while (i <= 2 * range) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of first " + range + " even nums: " + sum);
    }
}