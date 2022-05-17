package day11_if_statements;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temperature = input.nextDouble();
        if (temperature >= 70)
        {
            System.out.println("its a nice day");
            System.out.println("go outside ");
        }
        else {
            System.out.println("its too cold");
            System.out.println("code more java");

        }
    }
}