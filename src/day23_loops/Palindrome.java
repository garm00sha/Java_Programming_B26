package day23_loops;
import java.util.Scanner;
public class Palindrome {
    /*
        Palindrome: its the same reading from the beginning and end

        Ex:
            mom
            racecar
            anna
            madam

        Task: Check if a word is palindrome

        Flow:
            declare some initial String
            how to reverse a String
            check if the reverse version is the same as the original
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String str = input.nextLine();
         String reverse ;

        for (int i = str.length()-1; i >=0 ; i--) {
            str.charAt(i);
            System.out.print(str.charAt(i));

        }
    }
}
