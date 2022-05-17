package day27_nested_loops;
import java.util.Scanner;
public class Shape1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = input.nextInt();
        System.out.println("Enter number of columns");
        int columns = input.nextInt();
        System.out.println("Enter symbol");
        String symbol = input.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");

            }

        }

    }
}
