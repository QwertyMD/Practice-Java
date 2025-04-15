package tutorial02;

public class task12 {
    int i;

    public static void main(String[] args) {
        task12 mainInstance = new task12();
        mainInstance.printNums();
    }

    public void printNums() {
        for (i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
