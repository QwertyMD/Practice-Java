package workshop03;

public class task02 {
    int sum = 0, avg;
    int[] numbers;

    public static void main(String[] args) {
        task02 mainInstance = new task02();
        mainInstance.initArray();
        mainInstance.sumAvg();
    }

    public void initArray() {
        numbers = new int[]{1, 2, 3, 4, 5};
    }

    public void sumAvg() {
        for (int number : numbers) {
            sum += number;
        }
        avg = sum / numbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
