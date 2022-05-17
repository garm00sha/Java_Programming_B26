package day20_string;
import java.util.Scanner;
/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first string");
        String word1 = input.nextLine();
        System.out.println("enter the second string");
        String word2 = input.nextLine();
        System.out.println("enter the third string");
        String word3 = input.nextLine();

        if (word1.charAt(word1.length() - 1) == 'a') {
            if(  word1.length() > word2.length() && word1.length() > word3.length()){
                System.out.println("longest word that also contains 'a' "+ word1);
        }
        } else if (word2.charAt(word2.length() - 1) == 'a') {
            if(  word2.length() > word1.length() && word2.length() > word3.length()){
                System.out.println("longest word that also contains 'a' "+ word2);
    }else if (word3.charAt(word3.length() - 1) == 'a') {
                if(  word3.length() > word2.length() && word3.length() > word1.length()){
                    System.out.println("longest word that also contains 'a' "+ word3);
}}}}}
