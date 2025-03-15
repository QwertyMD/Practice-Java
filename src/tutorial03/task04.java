package tutorial03;

class Factorial {
    public static void main(String[] args) {
        task04.main(4);
    }
}

public class task04 {
    int factorial = 1, i;

    public static void main(int num) {
        task04 mainInstance = new task04();
        mainInstance.printFactorial(num);
    }

    public void printFactorial(int num) {
        for (i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
