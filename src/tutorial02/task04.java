package tutorial02;

import java.util.Scanner;

public class task04 {
    String gender;
    public static void main(String[] args){
        task04 mainInstance = new task04();
        mainInstance.readGender();
        mainInstance.printGender();
    }
    public void readGender(){
        Scanner data = new Scanner(System.in);
        System.out.println("Enter gender(F/M): ");
        gender = data.nextLine();
        data.close();
    }
    public void printGender(){
        switch(gender){
            case "F":
                System.out.println("You are female");
                break;
            case "M":
                System.out.println("You are male");
            default:
                System.out.println("You are ...");
        }
    }
}
