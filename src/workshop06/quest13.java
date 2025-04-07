package workshop06;

import java.util.ArrayList;
import java.util.Arrays;

public class quest13 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue", "yellow", "purple"));
        colors.sort(String::compareTo);
        System.out.println(colors);
        System.out.println(colors.reversed());
    }
}
