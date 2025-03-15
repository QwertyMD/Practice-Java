package tutorial03;

public class task01 {
    int[] numbers;

    public static void main(String[] args) {
        task01 mainInstance = new task01();
        mainInstance.initArray();
        mainInstance.printItems();
    }

    public void initArray() {
        numbers = new int[] { 1, 2, 3, 4, 5 };
    }

    public void printItems() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
