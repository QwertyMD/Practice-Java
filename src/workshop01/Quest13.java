package workshop01;

import java.util.Scanner;

public class Quest13 {
    int quantity;
    float pricePerItem;
    double totalCost;

    public static void main(String[] args) {
        Quest13 mainInstance = new Quest13();
        mainInstance.readData();
        mainInstance.printTotalCost();
    }

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of items: ");
        quantity = scanner.nextInt();
        System.out.println("Enter price per item: ");
        pricePerItem = scanner.nextFloat();
    }

    public void printTotalCost() {
        totalCost = quantity * pricePerItem;
        System.out.println("The total cost is: " + totalCost);
    }
}