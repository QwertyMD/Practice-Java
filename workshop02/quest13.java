package workshop02;

public class quest13 {
    int i = 10;

    public static void main(String[] args) {
        quest13 mainInstance = new quest13();
        mainInstance.printNums();
    }

    public void printNums() {
        while (i < 20) {
            if (i == 15) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
