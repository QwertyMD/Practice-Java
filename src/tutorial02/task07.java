package tutorial02;

public class task07 {
    int i, j;

    public static void main(String[] args) {
        task07 mainInstance = new task07();
        mainInstance.printPattern();
    }

    public void printPattern() {
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
