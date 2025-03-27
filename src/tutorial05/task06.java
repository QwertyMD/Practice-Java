package tutorial05;

interface PowerONOff {
    void turnOn();

    void turnOff();
}

interface DeviceInfo {
    void displayInfo();
}

interface ElectronicDevice extends PowerONOff, DeviceInfo {

}

class Television implements ElectronicDevice {
    @Override
    public void displayInfo() {
        System.out.println("Currently OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("Turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned OFF");
    }
}


public class task06 {
    public static void main(String[] args) {
        Television television = new Television();
        television.displayInfo();
        television.turnOn();
        television.turnOff();
    }
}
