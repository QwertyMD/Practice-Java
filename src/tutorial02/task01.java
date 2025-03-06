package tutorial02;

import java.util.Scanner;

public class task01 {
    int num1 = 15, num2 = 10;

    public static void main(String[] args) {
        task01 mainInstance = new task01();
//        mainInstance.readNums();
        mainInstance.checkCondition();
    }

    //    public void readNums(){
//        Scanner nums = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        num1 = nums.nextInt();
//        System.out.print("Enter second number: ");
//        num2 = nums.nextInt();
//    }
    public void checkCondition() {
        if (num1 + num2 > 20) {
            System.out.print("It is greater than 20");
        } else {
            System.out.print("It is not greater than 20");
        }
    }
}
