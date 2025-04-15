package tutorial03;

class Car {
    String color;
    int price;

    Car(String color, int price) {
        this.color = color;
        this.price = price;
    }
}

public class task02 {
    public static void main(String[] args) {
        task02 mainInstance = new task02();
        mainInstance.printItems();
    }

    public void printItems() {
        Car myCar = new Car("red", 1500000);
        System.out.println("Car ==> " + "color: " + myCar.color + " | " + "price: " + myCar.price);
    }
}
