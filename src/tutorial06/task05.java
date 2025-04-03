package tutorial06;

import java.util.LinkedList;

public class task05 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "purple");
        colors.remove("blue");
        System.out.println(colors);
    }
}
