package workshop02;

import java.util.Scanner;

public class quest02 {
    int num, i;

    public static void main(String[] args) {
        quest02 mainInstance = new quest02();
        mainInstance.readNum();
        mainInstance.printTable();
    }
    public void readNum(){
        Scanner nums = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = nums.nextInt();
        nums.close();
    }
    public void printTable(){
        for (i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i); 
        }
    }
}