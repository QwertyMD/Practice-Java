package tutorial06;

import java.util.TreeSet;

public class task10 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(99);
        nums.add(43);
        nums.add(21);
        nums.add(888);
        System.out.println(nums.descendingSet());
    }
}
