package workshop03;

import java.util.Arrays;

public class task01 {
    int i, temp;
    int[] numbers;

    public static void main(String[] args) {
        task01 mainInstance = new task01();
        mainInstance.initArray();
        mainInstance.revArray();
    }

    public void initArray() {
        numbers = new int[]{1, 2, 3, 4, 5};
    }

    public void revArray() {
        for (i = 0; i < numbers.length / 2; i++) {
            temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
