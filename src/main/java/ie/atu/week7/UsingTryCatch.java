package ie.atu.week7;

import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Please enter a number between 0 - 9 : ");
                int myNum = myScan.nextInt();

                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered " + myNum);
                    break;
                } else {
                    System.out.println("Not a valid number");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error Caught: " + e);
                myScan.next();
            }
        }
    }
}
