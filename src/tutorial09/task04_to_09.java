package tutorial09;

import java.io.*;

public class task04_to_09 {
    public static void main(String[] args) {
        task04_to_09 task = new task04_to_09();
        task.outputStream();
        task.inputStream();
        task.writer();
        task.reader();
        task.bufferedWriter();
        task.bufferedReader();
    }

    public void outputStream() {
        String text = "Java is a high level programming language.";
        try (OutputStream os = new FileOutputStream("src/tutorial09/task3.txt")) {
            os.write(text.getBytes());
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void inputStream() {
        try (InputStream is = new FileInputStream("src/tutorial09/task3.txt")) {
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writer() {
        String text = "Java is a high level programming language.";
        try (Writer writer = new FileWriter("src/tutorial09/task3.txt")) {
            writer.write(text);
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void reader() {
        try (Reader reader = new FileReader("src/tutorial09/task3.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void bufferedWriter() {
        String text = "Java is a high level programming language.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/tutorial09/task3.txt"))) {
            writer.write(text);
            System.out.println("File created successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void bufferedReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/tutorial09/task3.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
