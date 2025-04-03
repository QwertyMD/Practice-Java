package tutorial06;

import java.util.TreeSet;

public class task11 {
    public static void main(String[] args) {
        TreeSet<String> setA = new TreeSet<>();
        TreeSet<String> setB = new TreeSet<>();
        setA.add("violet");
        setA.add("indigo");
        setA.add("blue");
        setA.add("green");
        setB.add("green");
        setB.add("yellow");
        setB.add("orange");
        setB.add("red");
        TreeSet<String> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);
        TreeSet<String> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);
        TreeSet<String> difference = new TreeSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference: " + difference);
    }
}
