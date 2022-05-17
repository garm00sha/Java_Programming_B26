package day23_loops;
import java.util.Scanner;
public class MultiplicationTable {
    /*

        Task:
            declare and assign a number

            print all the multiplication results for 1 through 10

            Ex:
                4

                4 x 1 = 4
                4 x 2 = 8
                ..
                4 x 10 = 40

     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i ;
        for (i=1; i<=12;  i++){
            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}


