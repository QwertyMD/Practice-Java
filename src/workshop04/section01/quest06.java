package workshop04.section01;

final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

class BaseClass {
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

class SubClass extends BaseClass {
}

public class quest06 {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display();
        SubClass subClass = new SubClass();
        subClass.finalMethod();
    }
}