package workshop06;

import java.util.Stack;

public class quest05 {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();
        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");
        System.out.println(tasks);
        tasks.pop();
        System.out.println(tasks);
        tasks.push("Debug");
        tasks.push("Test");
        System.out.println(tasks.peek());
        System.out.println(tasks);
    }
}
