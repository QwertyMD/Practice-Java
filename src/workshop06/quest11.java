package workshop06;

import java.util.HashMap;
import java.util.Objects;

public class quest11 {
    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Mexico", "Mexico City");
        countryCapitals.put("UK", "London");
        countryCapitals.put("France", "Paris");
        quest11 quest = new quest11();
        quest.printMap(countryCapitals);
        quest.getCapital(countryCapitals);
        quest.containsCapital(countryCapitals);
        for (String key : countryCapitals.keySet()) {
            System.out.println(key + " : " + countryCapitals.get(key));
        }
    }

    public void printMap(HashMap<String, String> countryCapitals) {
        System.out.println(countryCapitals);
    }

    public void getCapital(HashMap<String, String> countryCapitals) {
        String country = "USA";
        String capital = countryCapitals.get(country);
        System.out.println(capital);
    }

    public void containsCapital(HashMap<String, String> countryCapitals) {
        String capital = "Ottawa";
        boolean contains = countryCapitals.containsValue(capital);
        System.out.println(contains);
    }
}
