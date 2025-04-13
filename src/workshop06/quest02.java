package workshop06;

import java.util.LinkedList;

public class quest02 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        LinkedList<Integer> list = new LinkedList<>();
        for (int num : nums) {
            list.add(num);
        }
        System.out.println(list);
        list.addFirst(0);
        list.addLast(0);
        System.out.println("After adding 0 to the first and last position:");
        System.out.println(list);
    }
}
