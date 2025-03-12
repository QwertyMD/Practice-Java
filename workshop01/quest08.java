package workshop01;

import java.util.Scanner;

public class quest08 {
    float radius, height, volume;

    public static void main(String[] args) {
        quest08 mainInstance = new quest08();
        System.out.println("Volume of cylinder");
        System.out.println(" ");
        mainInstance.readVals();
        System.out.println(" ");
        mainInstance.printVolume();
    }

    public void readVals() {
        Scanner values = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = values.nextFloat();
        System.out.println("Enter height: ");
        height = values.nextFloat();
        values.close();
    }

    public void printVolume() {
        volume = (float) (Math.PI * Math.pow(radius, 2) * height);
        System.out.println("The volume of the cylinder is: " + String.format("%.2f", volume));
    }
}
