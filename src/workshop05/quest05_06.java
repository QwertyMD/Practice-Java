package workshop05;

abstract class Vehicle {
    public abstract void wheel();
    public abstract void door();
}

class Bus extends Vehicle {
    @Override
    public void wheel() {
        System.out.println("This is bus wheel");
    }

    public void door() {
        System.out.println("This is wheel door");
    }
}

public class quest05_06 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.wheel();
        bus.door();
    }
}
