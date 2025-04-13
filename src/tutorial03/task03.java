package tutorial03;

import java.util.Scanner;

public class task03 {
    float num01, num02, product;

    public static void main(String[] args) {
        task03 mainInstance = new task03();
        mainInstance.readNums();
        mainInstance.printProduct();
    }

    public void readNums() {
        Scanner nums = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num01 = nums.nextFloat();
        System.out.println("Enter second number: ");
        num02 = nums.nextFloat();
        nums.close();
    }

    public void printProduct() {
        product = multiply(num01, num02);
        System.out.println(num01 + " x " + num02 + " = " + product);
    }

    public float multiply(float num01, float num02) {
        return num01 * num02;
    }
}
