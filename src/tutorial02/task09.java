package tutorial02;

public class task09 {
    int i, j;

    public static void main(String[] args) {
        task09 mainInstance = new task09();
        mainInstance.printPattern();
    }

    public void printPattern() {
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}