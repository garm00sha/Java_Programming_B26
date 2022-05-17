package day07_03_08_2022;
import java.util.Scanner;
public class EncryptPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password ");
        String password = input.nextLine();
        char x ='x';
        for (int i = 0; i <password.length() ; i++) {
            System.out.print("" + password.charAt(i) + x);


        }
    }
}
