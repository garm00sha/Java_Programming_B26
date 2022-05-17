package day29_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class LongestAndShortestWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter array length");
        int num = input.nextInt();
        String []words = new String [num];
        String longest ="";
        String shortest ="          " ;
         int count = 0;
        for (int i = 1; i < words.length ; i++) {
            System.out.println("Enter word");
            words[i] = input.next();
              count++;
            if(words[i].length() > longest.length()){
                longest= words[i];

            } if (shortest.length()> words[i].length()  ){
                shortest= words[i];

            }

    }System.out.println("The longest word "+ longest);
        System.out.println("The shortest word "+ shortest);

    }}
