package tutorial04;

public class quest12 {
    private static final class Animal {
        public void makeSound() {
            System.out.println("Grrrhhh");
        }
    }

    private static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}