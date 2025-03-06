package tutorial02;

public class task08 {
    int i, j, k;

    public static void main(String[] args) {
        task08 mainInstance = new task08();
        mainInstance.printPyramidPattern();
    }

    public void printPyramidPattern() {
        int rows = 5;
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}