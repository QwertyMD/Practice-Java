package workshop06;

import java.util.Arrays;
import java.util.LinkedList;

public class quest04 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("red", "green", "blue", "yellow", "purple"));
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println();
        if (colors.contains("red")) {
            System.out.println("The list contains red.");
        } else {
            System.out.println("The list does not contain red.");
        }
        java.util.Collections.shuffle(colors);
        System.out.println("Shuffled list: " + colors);
        java.util.Collections.sort(colors);
        System.out.println("Ascending order: " + colors);
    }
}
