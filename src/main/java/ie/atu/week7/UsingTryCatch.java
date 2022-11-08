package ie.atu.week7;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 - 9 : ");
        Scanner myScan = new Scanner(System.in);
        int myNum = myScan.nextInt();
        if (myNum <= 9 && myNum > 0) {
            System.out.println("You entered " + myNum);
        }
        else {
            System.out.println("Not a valid number");
        }
    }
}
