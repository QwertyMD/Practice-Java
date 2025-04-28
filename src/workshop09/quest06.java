package workshop09;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class quest06 {
    public static void main(String[] args) {
        HashMap<String, double[]> map = new HashMap<>();
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/workshop09/info.txt"));
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String product = parts[0];
                double price = Double.parseDouble(parts[1]);
                map.putIfAbsent(product, new double[2]);
                map.get(product)[0] += price;
                map.get(product)[1] += 1;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/workshop09/avg.csv"));
        ) {
            for (Map.Entry<String, double[]> entry : map.entrySet()) {
                String product = entry.getKey();
                double totalPrice = entry.getValue()[0];
                int count = (int) entry.getValue()[1];
                double averagePrice = totalPrice / count;
                writer.write(product + "," + averagePrice + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
