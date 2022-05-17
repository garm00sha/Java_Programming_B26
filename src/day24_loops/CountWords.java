package day24_loops;
import java.util.Scanner;
public class CountWords {
    /*
    Count Words
Given a sentence determine how many words are in the String.
Ex:
Input:
This has multiple words
Output:
4

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = input.nextLine();
        int count= 1;
        for (int i = 0; i < sentence. length(); i++) {
            if ((sentence. charAt(i) == ' ') && (sentence. charAt(i + 1) != ' ')) {
                count++; }
        } System. out. println("Number of words in sentence : " + count);
    } }

