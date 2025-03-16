package workshop03;

public class task05 {
    BankAccount account;

    public static void main(String[] args) {
        task05 mainInstance = new task05();
        mainInstance.initAttributes();
        mainInstance.depositMoney();
        mainInstance.withdrawMoney();
    }

    public void initAttributes() {
        task04 task04Instance = new task04();
        task04Instance.initAttributes();
        this.account = task04Instance.account;
    }

    public void depositMoney() {
        account.depositMoney(500.0f);
    }

    public void withdrawMoney() {
        account.withdrawMoney(200.0f);

    }
}
