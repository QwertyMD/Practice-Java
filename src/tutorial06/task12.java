package tutorial06;

import java.util.TreeSet;

public class task12 {
    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();
        for (int i = 1; i < 6; i++) {
            setA.add(i);
        }
        for (int i = 1; i < 4; i++) {
            setB.add(i);
        }
        System.out.println("setB is subset of setA: " + setA.containsAll(setB));
    }
}
