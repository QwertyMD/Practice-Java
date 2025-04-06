package workshop06;

import java.util.Stack;

public class quest06 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        Stack<String> stack = new Stack<>();
        for (String word : words) {
            stack.push(word);
        }
        System.out.println(String.join(" ", stack.reversed()));
    }
}
