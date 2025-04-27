package workshop09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class quest04 {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        ) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    count += 1;
                }
                System.out.println("Total words in file: " + count);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
