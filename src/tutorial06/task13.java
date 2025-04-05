package tutorial06;

import java.util.HashMap;

public class task13 {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("One", 1);
        obj.put("Two", 2);
        obj.put("Three", 3);
        obj.put("Four", 4);
        obj.put("Five", 5);
        System.out.println(obj);
        String check = "Three";
        if (obj.containsKey(check)) {
            System.out.println(check + " exists");
        } else {
            System.out.println(check + " doesn't exist");
        }
        String update = "Four";
        obj.put(update, 40);
        String remove = "One";
        obj.remove(remove);
        System.out.println("After removing " + remove + ": ");
        System.out.println(obj);
    }

}
