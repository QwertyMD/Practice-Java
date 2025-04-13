package workshop06;

import java.util.Arrays;
import java.util.HashSet;

public class quest09 {
    public static void main(String[] args) {
        String[] arr1 = {"Dog", "Cat", "Elephant", "Lion"};
        String[] arr2 = {"Cat", "Giraffe", "Dog", "Monkey"};
        HashSet<String> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(arr2));
        System.out.println(set1);
        System.out.println(set2);
        quest09 quest = new quest09();
        quest.performUnion(set1, set2);
        quest.performIntersection(set1, set2);
        quest.performDifference(set1, set2);
    }

    public void performUnion(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);
    }

    public void performIntersection(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);
    }

    public void performDifference(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);
    }
}
