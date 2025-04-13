package tutorial02;

public class task11 {
    int i;
    public static void main(String[] args) {
        task11 mainInstance = new task11();
        mainInstance.printNumbersFor();
        mainInstance.printNumbersWhile();
    }

    public void printNumbersFor() {
        for (i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public void printNumbersWhile() {
        i = 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}