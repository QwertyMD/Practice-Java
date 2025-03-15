package workshop01;

import java.util.Scanner;

public class quest13 {
    int quantity;
    float pricePerItem;
    double totalCost;

    public static void main(String[] args) {
        quest13 mainInstance = new quest13();
        mainInstance.readData();
        mainInstance.printTotalCost();
    }

    public void readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of items: ");
        quantity = scanner.nextInt();
        System.out.println("Enter price per item: ");
        pricePerItem = scanner.nextFloat();
        scanner.close();
    }

    public void printTotalCost() {
        totalCost = quantity * pricePerItem;
        System.out.println("The total cost is: " + totalCost);
    }
}