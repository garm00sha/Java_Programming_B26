package day25_recap;
import java.util.Scanner;
public class CamelCase {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        String word = "";
        String word1 = "";
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            word += sentence.charAt(i);

            if(sentence.charAt(i) == ' '){
                count++;
                if(count >= 2){
                    word = word.toUpperCase().charAt(0) + word.substring(1);
                }
                word1 += word;
                word = "";
            }
        }

        word = word.toUpperCase().charAt(0) + word.substring(1);
        word1 += word;
        word1 = word1.replaceAll(" ", "");


        System.out.println(word1);



    }}
