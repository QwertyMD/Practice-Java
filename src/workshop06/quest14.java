package workshop06;

import java.util.ArrayList;

import static java.util.Collections.binarySearch;

public class quest14 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nums.add(i);
        }
        int check = 55;
        int index = binarySearch(nums, check);
        if (index >= 0) {
            System.out.println(check + " found at index " + index);
        } else {
            System.out.println(check + " not found");
        }
    }
}
