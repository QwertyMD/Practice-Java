package tutorial04;

class A {
    public void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    public void display() {
        System.out.println("Class B");
    }
}

class C extends B {
    @Override
    public void display() {
        System.out.println("Class C");
    }
}

public class quest05_06_07_08 {
    public static void main(String[] args) {
        quest05_06_07_08 quest = new quest05_06_07_08();
        quest.displayClass();
    }

    public void displayClass() {
        C c = new C();
        c.display();
    }
}
