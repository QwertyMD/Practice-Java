package workshop02;

public class quest12 {
    int i = 10;

    public static void main(String[] args) {
        quest12 mainInstance = new quest12();
        mainInstance.printNums();
    }

    public void printNums() {
        while (i < 20) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
