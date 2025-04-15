package tutorial05;

abstract class Bank {
    public void getBalance() {
        System.out.println("Balance: 0");
    }
}

class BankA extends Bank {
    @Override
    public void getBalance() {
        System.out.println("Balance: $100");
    }
}

class BankB extends Bank {
    @Override
    public void getBalance() {
        System.out.println("Balance: $150");
    }
}

class BankC extends Bank {
    @Override
    public void getBalance() {
        System.out.println("Balance: $200");
    }
}

public class task02 {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
