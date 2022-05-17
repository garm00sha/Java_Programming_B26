package day10_scanner;
/*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */

import java.util.Scanner;

public class Apartment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the address");
        String address = input.nextLine();
        System.out.println("Enter name of owner");
        String nameOfOwner = input.nextLine();
        System.out.println("Enter number of units");
        int numberOfUnits = input.nextInt();
        System.out.println("Enter average size of each unit");
        double sizeOfUnit = input.nextDouble();
        System.out.println("Enter monthly rent amount");
        double monthlyRent = input.nextDouble();
        System.out.println("Enter number of washers and driers");
        int numberOfWasherAndDryer = input.nextInt();
        System.out.println("pets allowed");
        boolean isPetsAllowed;
        System.out.println("");





    }


}
