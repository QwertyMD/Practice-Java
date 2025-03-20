package tutorial04;

class Animal {
    public void makeSound() {
        System.out.println("Grrrhhh");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Vow Vow");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

public class quest03_04 {
    public static void main(String[] args) {
        quest03_04 quest = new quest03_04();
        quest.dogSound();
        quest.catSound();
    }

    public void dogSound() {
        Dog dog = new Dog();
        dog.makeSound();
    }

    public void catSound() {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
