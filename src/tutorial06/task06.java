package tutorial06;

import java.util.Stack;

public class task06 {
    public static void main(String[] args) {
        Stack<String> elems = new Stack<>();
        elems.push("A");
        elems.push("B");
        elems.push("C");
        elems.pop();
        elems.push("D");
        elems.push("E");
        System.out.println(elems.peek());
        System.out.println(elems);
    }
}
