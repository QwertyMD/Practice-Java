package tutorial03;

import java.util.Scanner;

class Add{
    Add(){
        task06.main(null);
    }
}

public class task06 {
    float num01, num02, sum;
    public static void main(String[] args) {
        task06 mainInstance = new task06();
        mainInstance.readNums();
        mainInstance.addNums();
    }
    public void readNums(){
        Scanner nums = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num01 = nums.nextFloat();
        System.out.println("Enter second number: ");
        num02 = nums.nextFloat();
        nums.close();
    }
    public void addNums(){
        sum = num01 + num02;
        System.out.println(num01 + " + " + num02 + " = " + sum);
    }
}
