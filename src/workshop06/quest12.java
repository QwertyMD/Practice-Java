package workshop06;

import java.util.ArrayList;

public class quest12 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(1);
        nums.add(-67);
        nums.add(0);
        nums.sort(Integer::compareTo);
        System.out.println(nums);
        System.out.println(nums.reversed());
    }
}
