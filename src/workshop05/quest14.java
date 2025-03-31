package workshop05;


public class quest14 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Cannot divide by 0");
        }
    }
}
