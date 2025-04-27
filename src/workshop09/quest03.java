package workshop09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class quest03 {
    public List<Integer> read(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String part : parts) {
                    numbers.add(Integer.parseInt(part));
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return numbers;
    }

    public List<Integer> getEven(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public void write(List<Integer> numbers, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int number : numbers) {
                writer.write(number + " ");
            }
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        quest03 q3 = new quest03();
        List<Integer> numbers = q3.read("src/workshop09/numbers.txt");
        List<Integer> evenNumbers = q3.getEven(numbers);
        List<Integer> oddNumbers = q3.getOdd(numbers);
        q3.write(evenNumbers, "src/workshop09/even.txt");
        q3.write(oddNumbers, "src/workshop09/odd.txt");
        System.out.println("Created files even.txt and odd.txt");
    }
}
