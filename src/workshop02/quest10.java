package workshop02;

public class quest10 {
    int i, j;

    public static void main(String[] args) {
        quest10 mainInstance = new quest10();
        mainInstance.printPattern();
    }

    public void printPattern() {
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}