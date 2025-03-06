package workshop01;

import java.util.Scanner;

public class Quest11 {
    float mile;
    double kilometer;

    public static void main(String[] args) {
        Quest11 mainInstance = new Quest11();
        mainInstance.readMile();
        mainInstance.printKilometer();
    }

    public void readMile() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the distance in mile: ");
        mile = value.nextFloat();
    }

    public void printKilometer() {
        kilometer = mile * 1.60934f;
        System.out.println(mile + " miles = " + kilometer + " km");
    }
}
