package workshop01;

public class quest02 {
    int difference = 45 - 32;
    int product = 45 * 32;

    public static void main(String[] args) {
        quest02 mainInstance = new quest02();
        mainInstance.printDifference();
        mainInstance.printProduct();
    }

    public void printDifference() {
        System.out.println("The difference of 45 and 32 is: 45 - 32 = " + difference);
    }

    public void printProduct() {
        System.out.println("The product of 45 and 32 is: 45 * 32 = " + product);
    }
}
