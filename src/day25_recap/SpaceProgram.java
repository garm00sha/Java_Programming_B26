package day25_recap;
import java.util.Scanner;
public class SpaceProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word = input.nextLine();

        char space = ' ';

        for (int i = 0; i < word.length(); i++) {

            System.out.print("" + word.charAt(i) + space);

            if (word.contains(" ")) {

                word =  word.replace(" ", "_");
            }
    }
}}
