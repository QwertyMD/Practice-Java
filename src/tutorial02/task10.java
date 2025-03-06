package tutorial02;

import java.util.Scanner;

public class task10 {
    int num, res, i;
    public static void main(String[] args) {
        task10 mainInstance = new task10();
        mainInstance.readNum();
        mainInstance.printFact();
    }

    public void readNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
    }

    public void printFact() {
        res = 1;
        for (i=1;i<=num;i++){
            res*=i;
        }
        System.out.println("Factorial of " + num + " is " + res);
    }
}