package tutorial06;

import java.util.ArrayList;

public class task01_02 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Jimmy");
        studentList.add("Zelda");
        studentList.add("Sarah");
        studentList.remove("Sarah");
        System.out.println(studentList);
        System.out.println(studentList.reversed());
    }
}
