package tutorial06;

import java.util.HashSet;

public class task08 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 1; i < 6; i++) {
            nums.add(i);
        }
        nums.add(5);
        System.out.println(nums);
    }
}
