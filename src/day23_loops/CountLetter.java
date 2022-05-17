package day23_loops;
import java.util.Scanner;
public class CountLetter {
    /*

            Given a String we want to count how many 'a' characters we have

            Challenge: adjust so that we can check for not only 'a' but any character

         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.nextLine();
        System.out.println("Enter the letter you want to check");
         char letter = input.next().charAt(0);
         int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){

             count++;

        }
    }
        System.out.println(count);
}}
