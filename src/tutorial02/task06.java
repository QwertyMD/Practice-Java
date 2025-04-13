package tutorial02;

public class task06 {
    int i;

    public static void main(String[] args) {
        task06 mainInstance = new task06();
        mainInstance.printEvenNums();
    }

    public void printEvenNums() {
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
