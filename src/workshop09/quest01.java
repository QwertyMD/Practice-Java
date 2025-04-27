package workshop09;

import java.io.*;

public class quest01 {
    public static void main(String[] args) {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/workshop09/one.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/workshop09/two.txt"));
        ) {
            byte[] buffer = new byte[1024];
            int i;
            while ((i = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, i);
            }
            System.out.println("Read from one.txt and write to two.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
