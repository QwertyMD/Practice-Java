package workshop04;

class Parent {
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    public String publicVar = "Public Variable";

    public String getPrivateVar() {
        return privateVar;
    }
}

class Child extends Parent {
    public void printVariables() {
        System.out.println("Private Variable: " + getPrivateVar());
        System.out.println("Protected Variable: " + protectedVar);
        System.out.println("Public Variable: " + publicVar);
    }
}

public class quest05 {
    public static void main(String[] args) {
        Child child = new Child();
        child.printVariables();
    }
}