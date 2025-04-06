package workshop06;

import java.util.LinkedList;
import java.util.Queue;

public class quest07 {
    public static void main(String[] args) {
        Queue<String> print = new LinkedList<>();
        print.add("Document1");
        print.add("Document2");
        print.add("Document3");
        System.out.println(print);
        print.remove();
        System.out.println(print);
        print.add("Document4");
        print.add("Document5");
        System.out.println(print.peek());
        System.out.println(print);
    }
}
