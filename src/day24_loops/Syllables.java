package day24_loops;
import java.util.Scanner;
public class Syllables {
    /*
    Syllables
Given a String separated by dashes calculate how many syllables the
words are
Ex:
Input:
ja-va
Output:
2

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String word = input.nextLine();
        int syllables= 1;
        for (int i = 0; i < word. length(); i++) {
            if ((word. charAt(i) == '-') && (word. charAt(i + 1) != '-')) {
                syllables++; }
        } System. out. println("Number of syllables in word : " + syllables);


}}
