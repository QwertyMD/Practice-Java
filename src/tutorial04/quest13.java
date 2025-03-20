package tutorial04;

class Vehicle {
    public void start() {
        System.out.println("Vroom Vroom");
    }
}

class Car extends Vehicle {

}

public class quest13 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
