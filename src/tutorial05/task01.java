package tutorial05;

abstract class Parent {
    public void message() {
        System.out.println("Abstract message");
    }
}

class ChildClass1 extends Parent {
    @Override
    public void message() {
        System.out.println("This is first subclass");

    }
}

class ChildClass2 extends Parent {
    @Override
    public void message() {
        System.out.println("This is second subclass");

    }
}

public class task01 {
    public static void main(String[] args) {
        ChildClass1 c1 = new ChildClass1();
        ChildClass2 c2 = new ChildClass2();
        c1.message();
        c2.message();
    }
}
