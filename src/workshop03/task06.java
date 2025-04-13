package workshop03;

import java.util.Objects;
import java.util.Scanner;

class Lamp {
    boolean isOn = false;

    public void turnOff() {
        isOn = false;
        System.out.println("Lamp has been turned off");
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Lamp has been turned on");
    }
}

public class task06 {
    String choice;
    Lamp lamp = new Lamp();

    public static void main(String[] args) {
        task06 mainInstance = new task06();
        mainInstance.toggleLight();
    }

    public void toggleLight() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type on/off to toggle lamp light, 'q' to exit: ");
            choice = scanner.next();
            if (Objects.equals(choice, "on")) {
                lamp.turnOn();
            } else if (Objects.equals(choice, "off")) {
                lamp.turnOff();
            } else if (Objects.equals(choice, "q")) {
                break;
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


