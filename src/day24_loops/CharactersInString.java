package day24_loops;

import java.util.Scanner;

public class CharactersInString {
    /*
    Characters in String
Given a String print the ascii value codes for each character
Ex:
Input:
“java”
Output:
106 97 118 97

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word");
        String word=input.nextLine();

        for(int i=0; i<word.length(); i++)
        {
            int asciiValue = word.charAt(i);


            System.out.print( asciiValue + " ");
        }

    }

    }
