package workshop09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class quest07 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/workshop09/sample.csv"))) {
            String headerLine = reader.readLine();
            String[] headers = headerLine.split(",");
            List<BufferedWriter> writers = new ArrayList<>();
            for (String header : headers) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/workshop09/" + header.trim() + ".txt"));
                writers.add(writer);
            }
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (int i = 0; i < values.length; i++) {
                    writers.get(i).write(values[i].trim());
                    writers.get(i).newLine();
                }
            }
            for (BufferedWriter writer : writers) {
                if (writer != null) {
                    writer.close();
                }
            }
            System.out.println("Data Exported.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}