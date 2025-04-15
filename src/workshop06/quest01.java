package workshop06;

import java.util.ArrayList;
import java.util.Arrays;

public class quest01 {
    public static void main(String[] args) {
        String[] list = {"Geralt", "Walter", "Sansa", "Lily", "Batman"};
        ArrayList<String> students = new ArrayList<>(Arrays.asList(list));
        System.out.println(students);
        String name = "Batman";
        students.remove(name);
        System.out.println("Removed " + name + " from the list.");
        System.out.println(students);
    }
}