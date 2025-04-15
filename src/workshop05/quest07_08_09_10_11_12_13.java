package workshop05;

interface Animal {
    void eat();

    void walk();
}

interface Printable {
    void display();
}

class Cow implements Animal, Printable {
    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }

    public void walk() {
        System.out.println("Cow is walking");
    }

    public void display() {
        System.out.println("This is a cow");
    }
}

interface LivingBeing {
    void specialFeature();
}

class Fish implements LivingBeing {
    @Override
    public void specialFeature() {
        System.out.println("Fish can swim");
    }
}

class Bird implements LivingBeing {
    @Override
    public void specialFeature() {
        System.out.println("Bird can fly");
    }
}

public class quest07_08_09_10_11_12_13 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
        cow.walk();
        cow.display();

        Fish fish = new Fish();
        fish.specialFeature();

        Bird bird = new Bird();
        bird.specialFeature();
    }
}
