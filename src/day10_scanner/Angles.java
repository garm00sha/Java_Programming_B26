package day10_scanner;
import java.util.Scanner;

/* Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0 */

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 angle numbers");

        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();
        boolean isTriangle = angleOne + angleTwo + angleThree == 180;
        boolean isCircle = angleOne + angleTwo + angleThree == 360;
        System.out.println("is a triangle " + isTriangle);
        System.out.println("is a circle " + isCircle);



    }

}

