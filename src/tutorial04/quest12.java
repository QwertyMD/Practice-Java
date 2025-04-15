package tutorial04;

public class quest12 {
    private static class Animal {
        public void makeSound() {
            System.out.println("Vow Vow");
        }
    }

    private static class Dog extends Animal {

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
