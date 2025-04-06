package workshop06;

import java.util.ArrayList;

public class quest03 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            nums.add(i);
        }
        System.out.println(nums);
        for (int i = 0; i < 2; i++) {
            int last = nums.removeLast();
            nums.addFirst(last);
        }
        System.out.println("After rotating to right by 2 positions :");
        System.out.println(nums);
    }
}
