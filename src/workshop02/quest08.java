package workshop02;

import java.util.Scanner;

public class quest08 {
    int mark01, mark02, mark03, mark04, mark05, total;
    float percentage;

    public static void main(String[] args) {
        quest08 mainInstance = new quest08();
        mainInstance.readMarks();
        mainInstance.calcGrade();
    }

    public void readMarks() {
        Scanner marks = new Scanner(System.in);
        System.out.println("Enter marks for Physics: ");
        mark01 = marks.nextInt();
        System.out.println("Enter marks for Chemistry: ");
        mark02 = marks.nextInt();
        System.out.println("Enter marks for Biology: ");
        mark03 = marks.nextInt();
        System.out.println("Enter marks for Mathematics: ");
        mark04 = marks.nextInt();
        System.out.println("Enter marks for Computer: ");
        mark05 = marks.nextInt();
    }

    public void calcGrade() {
        total = mark01 + mark02 + mark03 + mark04 + mark05;
        percentage = (float) total / 500 * 100;
        if (percentage >= 90) {
            System.out.println("You scored A with " + percentage + "%");
        } else if (percentage >= 80) {
            System.out.println("You scored B with " + percentage + "%");
        } else if (percentage >= 70) {
            System.out.println("You scored C with " + percentage + "%");
        } else if (percentage >= 60) {
            System.out.println("You scored D with " + percentage + "%");
        } else if (percentage >= 40) {
            System.out.println("You scored E with " + percentage + "%");
        } else {
            System.out.println("You failed with " + percentage + "%");
        }
    }
}