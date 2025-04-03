package tutorial06;

import java.util.LinkedList;
import java.util.Queue;

public class task07 {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.add("A");
        que.add("B");
        que.add("C");
        que.remove("A");
        que.add("D");
        que.add("E");
        System.out.println(que.peek());
        System.out.println(que);
    }
}
