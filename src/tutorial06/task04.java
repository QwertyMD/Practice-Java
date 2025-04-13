package tutorial06;

import java.util.LinkedList;

public class task04 {
    public static void main(String[] args) {
        LinkedList<String> arrayList = new LinkedList<>();
        arrayList.add("of");
        arrayList.addFirst("God");
        arrayList.addLast("War");
        if (arrayList.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(arrayList);
        }
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
    }
}
