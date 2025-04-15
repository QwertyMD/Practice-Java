package workshop06;

import java.util.HashMap;

public class quest10 {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();
        contacts.put("Mario", 123456789);
        contacts.put("Luigi", 987654321);
        contacts.put("Peach", 456789123);
        contacts.put("Toad", 321654987);
        contacts.put("Yoshi", 789123456);
        contacts.put("Bowser", 654321789);
        System.out.println(contacts);
    }
}
