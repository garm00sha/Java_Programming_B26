package day19_string;
import java.util.Scanner;

public class funTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your  sentence: ");
        String sentence = input.nextLine();
        int lastIndex = sentence.length() - 1;
        System.out.println("First char: " +sentence.charAt(0));
        System.out.println("Last char: "+ sentence.charAt(lastIndex));
    }
}
