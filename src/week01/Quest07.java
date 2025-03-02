package week01;

import java.util.Scanner;

public class Quest07 {
    double celsius, fahrenheit;

    public static void main(String[] args) {
        Quest07 mainInstance = new Quest07();
        mainInstance.readCelsius();
        mainInstance.printFahrenheit();
    }

    public void readCelsius() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        celsius = value.nextDouble();
    }

    public void printFahrenheit() {
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
    }
}
