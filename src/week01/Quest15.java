package week01;

public class Quest15 {

    public static void main(String[] args) {
        Quest15 mainInstance = new Quest15();
        mainInstance.logicalAND();
        mainInstance.logicalOR();
        mainInstance.logicalNOT();
    }

    public void logicalAND() {
        if ((5 > 3) && (8 > 5)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void logicalOR() {
        if ((5 > 3) || (2 > 5)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void logicalNOT() {
        if (5 != 10) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
