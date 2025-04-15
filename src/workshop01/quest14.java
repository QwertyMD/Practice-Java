package workshop01;

import java.util.Scanner;

public class quest14 {
    float USD, rate;
    double convertedAmount;

    public static void main(String[] args) {
        quest14 converter = new quest14();
        converter.readValues();
        converter.printConvertedAmount();
    }

    public void readValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount in USD: ");
        USD = scanner.nextFloat();
        System.out.println("Enter the exchange rate: ");
        rate = scanner.nextFloat();
        scanner.close();
    }

    public void printConvertedAmount() {
        convertedAmount = USD * rate;
        System.out.println("The converted amount is: " + convertedAmount);
    }
}