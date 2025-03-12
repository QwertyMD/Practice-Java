package tutorial02;

public class task01 {
    int num1 = 15, num2 = 10;

    public static void main(String[] args) {
        task01 mainInstance = new task01();
        mainInstance.checkCondition();
    }
    public void checkCondition() {
        if (num1 + num2 > 20) {
            System.out.print("It is greater than 20");
        } else {
            System.out.print("It is not greater than 20");
        }
    }
}
